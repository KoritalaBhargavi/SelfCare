import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = null;
        System.out.println("🔐 Welcome to the Self Care App!");
        boolean authe = false;

        while (!authe) {
            try {
                System.out.println("\n1.Register \uD83D\uDCDD");
                System.out.println("2.Login \uD83D\uDD11");
                System.out.print("Choose an option: ");
                int Option = Integer.parseInt(sc.nextLine().trim());
                if (Option == 1) {
                    boolean registered = false;
                    while (!registered) {
                        System.out.print("Enter a new username (Title Case): ");
                        userName = sc.nextLine().trim();
                        if (isUsernameTaken(userName)) {
                            System.out.println("❌ Username already taken. Try another.");
                        } else {
                            System.out.print("Set your password: ");
                            String password = sc.nextLine();
                            Userregister(userName, password);
                            System.out.println("✅ Registered successfully! Please login now.");
                            registered = true;
                        }
                    }
                } else if (Option == 2) {
                    System.out.print("Enter your username: ");
                    userName = sc.nextLine().trim();
                    System.out.print("Enter your password: ");
                    String password = sc.nextLine();

                    if (loginUser(userName, password)) {
                        System.out.println("✅ Login successful!");
                        authe = true;
                    } else {
                        System.out.println("❌ Incorrect username or password. Try again.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Wrong Option");
            }
//            }else {
//                System.out.println("⚠️ Invalid option. Please select 1 or 2.");
//            }
        }


        String repeat;

            do {
                System.out.println("1. Skin Care 🧴");
                System.out.println("2. Hair Care 👩‍🦰");
                System.out.println("3. Body Care 🛁");
                System.out.println("4. Gut Care 🥣");
                System.out.println("5. View My Logs 📄");
                System.out.println("6. Clear My Logs🧹");
                System.out.println("7. Exit 👋");


                System.out.print("\nChoose an option: ");
                int option = sc.nextInt();
                sc.nextLine();


                if (option == 5) {
                    viewlogs(userName);
                    System.out.print("\nDo you want to continue with a self-care section? 🤔 (yes/no): ");
                    repeat = sc.nextLine().trim().toLowerCase();
                    continue;
                }

                SelfCareArea area = null;
                switch (option) {
                    case 1:
                        area = new SkinCare(userName);
                        break;
                    case 2:
                        area = new HairCare(userName);
                        break;
                    case 3:
                        area = new BodyCare(userName);
                        break;
                    case 4:
                        area = new GutCare(userName);
                        break;
                    case 6: {
                        System.out.print("🗑️ Do you want to delete your logs? (yes/no): ");
                        String confirm = sc.nextLine().trim().toLowerCase();
                        if (confirm.equals("yes")) {
                            clearUserLogs(userName);
                        }
                        break;
                    }

                    case 7: {
                        System.out.println("Thank you for using the Self Care App, See you soon! 👋");
                        return;
                    }
                    default:
                        System.out.println("❌ Invalid choice. Please try again.");
                }

                if (area != null) {
                    String issue = area.chooseSubCategory();
                    area.suggestHomeRemedies();
                    area.suggestMedicalRemedies();
                    area.suggestFoods();
                    saveUserSelection(userName, area.getClass().getSimpleName(), issue);
                    System.out.print("\n📂 Do you want to view your previous logs for this section? (yes/no): ");
                    String logChoice = sc.nextLine().trim().toLowerCase();
                    if (logChoice.equals("yes")) {
                        viewlogs(userName);
                    }
                }

                System.out.print("\nDo you want to try another self-care section? 🤔 (yes/no): ");
                repeat = sc.nextLine().trim().toLowerCase();

            } while (repeat.equals("yes"));

            System.out.println("Goodbye!We'll Be Waiting For You Take care 👋👋");
        }

    public static void saveUserSelection(String userName, String category, String issue) {
        try (FileWriter fw = new FileWriter("users_log.csv", true)) {
            fw.write(userName + "," + category + "," + issue + "\n");
        } catch (IOException e) {
            System.out.println("⚠️ Error saving user selection: " + e.getMessage());
        }
    }

    public static void viewlogs(String userName) {
        String[] sections = {"SkinCare", "HairCare", "BodyCare", "GutCare"};
        boolean foundAny = false;

        for (String section : sections) {
            File file = new File(section + "_log.txt");
            if (!file.exists()) continue;

            try (Scanner reader = new Scanner(file)) {
                boolean found = false;
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    if (line.startsWith(userName + ":")) {
                        if (!found) {
                            System.out.println("\n📂 Logs from " + section + ":");
                            found = true;
                            foundAny = true;
                        }
                        System.out.println("➤ " + line);
                    }
                }
            } catch (IOException e) {
                System.out.println("⚠️ Could not read logs from " + section + ": " + e.getMessage());
            }
        }

        if (!foundAny) {
            System.out.println("\n🚫 No logs found for user: " + userName);
        }
    }

    public static void clearUserLogs(String userName) {
        String[] sections = {"SkinCare", "HairCare", "BodyCare", "GutCare"};
        boolean logsDeleted = false;

        for (String section : sections) {
            File file = new File(section + "_log.txt");
            if (!file.exists()) continue;

            File tempFile = new File("temp_" + section + "_log.txt");

            try (
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))
            ) {
                String line;
                boolean userFoundInFile = false;
                while ((line = reader.readLine()) != null) {
                    if (!line.startsWith(userName + ":")) {
                        writer.write(line);
                        writer.newLine();
                    } else {
                        userFoundInFile = true;
                    }
                }

                if (userFoundInFile) {
                    logsDeleted = true;
                }

            } catch (IOException e) {
                System.out.println("❌ Error processing logs: " + e.getMessage());
            }

            if (!file.delete() || !tempFile.renameTo(file)) {
                System.out.println("⚠️ Failed to update logs for " + section);
            }
        }

        if (logsDeleted) {
            System.out.println("✅ Your logs have been deleted successfully!");
        } else {
            System.out.println("ℹ️ No logs found for this user.");
        }
    }
    public static boolean isUsernameTaken(String username) {
        File file = new File("users_db.txt");
        if (!file.exists()) return false;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].trim().equalsIgnoreCase(username)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("⚠️ Error checking username: " + e.getMessage());
        }

        return false;
    }



    public static void Userregister(String username, String password) {
        if (isUsernameTaken(username)) {
            System.out.println("❌ Username already exists. Please choose a different one.");
            return;
        }

        try (FileWriter fw = new FileWriter("users_db.txt", true)) {
            fw.write(username + ":" + password + "\n");
        } catch (IOException e) {
            System.out.println("⚠️ Error registering user: " + e.getMessage());
        }
    }


    public static boolean loginUser(String username, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("users_db.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String storedUser = parts[0].trim();
                    String storedPass = parts[1].trim();
                    if (storedUser.equals(username) && storedPass.equals(password)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("⚠️ Error reading user database: " + e.getMessage());
        }
        return false;
    }

}
