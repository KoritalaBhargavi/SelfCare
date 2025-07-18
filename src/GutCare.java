import java.util.Scanner;

public class GutCare extends SelfCareArea {

    public GutCare(String userName) {
        super(userName);
    }

    @Override
    public String chooseSubCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your gut health concern:");
        System.out.println("1. Indigestion 🤢\n2. Constipation 🚫💩\n3. Bloating 🎈\n4. Acid Reflux 🔥");
        int choice = sc.nextInt();
        sc.nextLine();

        selectedIssue = switch (choice) {
            case 1 -> "Indigestion";
            case 2 -> "Constipation";
            case 3 -> "Bloating";
            case 4 -> "Acid Reflux";
            default -> "Invalid";
        };

        System.out.println("You selected: " + selectedIssue);
        logActivity("Gut Health Concern: " + selectedIssue);
        return selectedIssue;
    }

    @Override
    public void suggestHomeRemedies() {
        System.out.println("   🏠 Gut Care Home Remedies   ");

        switch (selectedIssue) {
            case "Indigestion" -> {
                System.out.println("1. 🍋 Drink warm lemon water.");
                System.out.println("2. 🍵 Ginger tea after meals.");
                System.out.println("3. 🍌 Eat bananas.");
                logActivity("Home Remedies for Indigestion: 🍋Warm lemon water, 🍵Ginger tea, 🍌Bananas");
            }
            case "Constipation" -> {
                System.out.println("1. 🥦 Eat fiber-rich fruits and vegetables.");
                System.out.println("2. 💧 Drink plenty of water.");
                System.out.println("3. 🥣 Soaked raisins or prunes.");
                logActivity("Home Remedies for Constipation: 🥦Fiber foods, 💧Water, 🥣Prunes/Raisins");
            }
            case "Bloating" -> {
                System.out.println("1. 🍵 Try ginger tea or fennel seeds.");
                System.out.println("2. 🥒 Eat cucumber and melon.");
                System.out.println("3. 🚶 Go for short walks after meals.");
                logActivity("Home Remedies for Bloating:  🍵Ginger/fennel tea, 🥒Cucumber, 🚶Walking");
            }
            case "Acid Reflux" -> {
                System.out.println("1. 🥛 Cold milk.");
                System.out.println("2. 🍌 Bananas.");
                System.out.println("3. 🥗 Avoid spicy foods.");
                logActivity("Home Remedies for Acid Reflux: 🥛Cold milk, 🍌Bananas, 🥗Avoid spicy food");
            }
        }

        System.out.println();
    }

    @Override
    public void suggestMedicalRemedies() {
        System.out.println("   💊 Gut Care Medical Remedies   ");

        switch (selectedIssue) {
            case "Indigestion" -> {
                System.out.println("1. 💊 Antacids.");
                System.out.println("2. 💊 Digestive enzyme tablets.");
                System.out.println("3. 🦠 Probiotic supplements.");
                logActivity("Medical Remedies for Indigestion: Antacids, Digestive enzymes, Probiotics");
            }
            case "Constipation" -> {
                System.out.println("1. 💊 Laxatives (consult doctor).");
                System.out.println("2. 💊 Fiber supplements.");
                System.out.println("3. 💊 Stool softeners.");
                logActivity("Medical Remedies for Constipation: Laxatives, Fiber supplements, Stool softeners");
            }
            case "Bloating" -> {
                System.out.println("1. 💊 Simethicone tablets.");
                System.out.println("2. 💊 Probiotics.");
                System.out.println("3. \uD83E\uDEA8 Activated charcoal (consult doctor).");
                logActivity("Medical Remedies for Bloating: 💊Simethicone, 💊Probiotics, 💊Activated charcoal");
            }
            case "Acid Reflux" -> {
                System.out.println("1. 💊 Proton pump inhibitors (PPIs).");
                System.out.println("2. 💊 H2 blockers.");
                System.out.println("3. 💊 Antacids like Gaviscon.");
                logActivity("Medical Remedies for Acid Reflux: 💊PPIs, 💊H2 blockers, 💊Antacids");
            }
        }

        System.out.println();
    }

    @Override
    public void suggestFoods() {
        System.out.println("   🍽️ Recommended Foods for Gut Health   ");

        switch (selectedIssue) {
            case "Indigestion" -> {
                System.out.println("1. 🍚 Easily digestible foods (rice, bananas).");
                System.out.println("2. 🍵 Mint or chamomile tea.");
                System.out.println("3. 🥣 Curd and yogurt.");
                logActivity("Foods for Indigestion: 🍚Rice, 🍌Bananas, 🥣Curd, 🍵Herbal teas");
            }
            case "Constipation" -> {
                System.out.println("1. 🥬 Spinach and beans.");
                System.out.println("2. 🍎 Apples and pears.");
                System.out.println("3. 💧 Water.");
                logActivity("Foods for Constipation: 🥬Spinach, 🍎Apples, 💧Water");
            }
            case "Bloating" -> {
                System.out.println("1. 🍵 Fennel seeds tea.");
                System.out.println("2. 🍉 Watermelon and cucumber.");
                System.out.println("3. 🥗 Light salads.");
                logActivity("Foods for Bloating: 🍵Fennel tea, 🍉Watermelon, 🥗Cucumber");
            }
            case "Acid Reflux" -> {
                System.out.println("1. 🥛 Milk and oats.");
                System.out.println("2. 🍌 Bananas.");
                System.out.println("3. 🍞 Bland carbs like bread and rice.");
                logActivity("Foods for Acid Reflux: 🥛Milk, 🍌Bananas, 🍞Bread/Oats");
            }
        }

        System.out.println();
    }
}
