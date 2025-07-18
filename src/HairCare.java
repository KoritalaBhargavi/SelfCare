import java.util.Scanner;

public class HairCare extends SelfCareArea {

    public HairCare(String userName) {
        super(userName);
    }

    @Override
    public String chooseSubCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your scalp condition:");
        System.out.println("1. Oily Scalp 💧\n2. Dry Scalp 🌵\n3. Dandruff ❄️\n4. Hairfall 🧑‍🦲");
        int choice = sc.nextInt();
        sc.nextLine();

        selectedIssue = switch (choice) {
            case 1 -> "Oily Scalp";
            case 2 -> "Dry Scalp";
            case 3 -> "Dandruff";
            case 4 -> "Hairfall";
            default -> "Invalid";
        };

        System.out.println("You selected: " + selectedIssue);
        logActivity("Scalp Category: " + selectedIssue);
        return selectedIssue;
    }

    @Override
    public void suggestHomeRemedies() {
        System.out.println("\n-- 🏠 Hair Care Home Remedies --");

        switch (selectedIssue) {
            case "Oily Scalp" -> {
                System.out.println("1. 🍋 Lemon juice and apple cider vinegar rinse.");
                System.out.println("2. 🍵 Green tea hair rinse.");
                System.out.println("3. 🧴 Use clay masks once a week.");
                logActivity("Home Remedies for Oily Scalp: 🍋Lemon juice + ACV, 🍵Green tea rinse, 🧴Clay masks");
            }
            case "Dry Scalp" -> {
                System.out.println("1. 🌿 Aloe vera gel massage.");
                System.out.println("2. 🥥 Coconut oil overnight treatment.");
                System.out.println("3. 🥛 Yogurt and honey hair mask.");
                logActivity("Home Remedies for Dry Scalp: 🌿Aloe vera massage, 🥥Coconut oil, 🥛Yogurt + 🍯Honey mask");
            }
            case "Dandruff" -> {
                System.out.println("1. 🥥🍋 Apply coconut oil and lemon juice.");
                System.out.println("2. 🌿 Neem paste or neem water rinse.");
                System.out.println("3. 🍶 Curd + fenugreek seed paste.");
                logActivity("Home Remedies for Dandruff: 🥥🍋Coconut oil + Lemon,🌿 Neem rinse, 🍶Curd + Fenugreek");
            }
            case "Hairfall" -> {
                System.out.println("1. 🧅 Use onion juice for hair growth.");
                System.out.println("2. 🌿 Bhringraj oil massage.");
                System.out.println("3. 🧄 Garlic and coconut oil blend.");
                logActivity("Home Remedies for Hairfall: 🧅Onion juice, 🌿Bhringraj oil, 🧄Garlic + 🥥Coconut oil");
            }
        }
        System.out.println();
    }

    @Override
    public void suggestMedicalRemedies() {
        System.out.println("\n-- 💊 Hair Care Medical Remedies --");

        switch (selectedIssue) {
            case "Oily Scalp" -> {
                System.out.println("1. 🧴 Medicated anti-sebum shampoos.");
                System.out.println("2. 💊 Oral zinc supplements (consult doctor).");
                System.out.println("3. 🧼 Salicylic acid-based scalp cleansers.");
                logActivity("Medical Remedies for Oily Scalp: 🧴Anti-sebum shampoos,💊 Zinc supplements, 🧼Salicylic acid scalp cleansers");
            }
            case "Dry Scalp" -> {
                System.out.println("1. 🧴 Hydrating shampoos with glycerin.");
                System.out.println("2. 💊 Biotin supplements.");
                System.out.println("3. 🧴 Use scalp serums with ceramides.");
                logActivity("Medical Remedies for Dry Scalp: 🧴Hydrating shampoo, 💊Biotin, 🧴Ceramide serums");
            }
            case "Dandruff" -> {
                System.out.println("1. 🧴 Use ketoconazole shampoo.");
                System.out.println("2. 💊 Antifungal creams (prescribed).");
                System.out.println("3. 🧴 Selenium sulfide shampoo.");
                logActivity("Medical Remedies for Dandruff: Ketoconazole, Selenium sulfide, Antifungal creams");
            }
            case "Hairfall" -> {
                System.out.println("1. 🧴 Try minoxidil (consult doctor).");
                System.out.println("2. 💊 Vitamin B7, B12, iron supplements.");
                System.out.println("3. 💉 PRP therapy (consult dermatologist).");
                logActivity("Medical Remedies for Hairfall: 🧴Minoxidil, 💊B7/B12/Iron, 💉PRP therapy");
            }
        }
        System.out.println();
    }

    @Override
    public void suggestFoods() {
        System.out.println("-- 🍽️ Recommended Foods for Hair --");

        switch (selectedIssue) {
            case "Hairfall" -> {
                System.out.println("1. 🍳 Protein-rich foods like eggs and fish.");
                System.out.println("2. 🍫 Iron-rich foods like spinach and dates.");
                System.out.println("3. 🥜 Omega-3 fatty acids: walnuts, chia seeds.");
                logActivity("Foods for Hairfall: 🍳Eggs, 🍫Fish, 🥬Spinach, Dates, 🥜Walnuts, Chia seeds");
            }
            case "Dandruff" -> {
                System.out.println("1. 🥣 Yogurt for probiotics.");
                System.out.println("2. 🎃 Zinc-rich foods like pumpkin seeds.");
                System.out.println("3. 💧 Drink more water.");
                logActivity("Foods for Dandruff: 🥣Yogurt, 🎃Pumpkin seeds, 💧Water");
            }
            case "Dry Scalp" -> {
                System.out.println("1. 🥑 Healthy fats: avocado, nuts.");
                System.out.println("2. 🥛 Hydrating drinks: milk, buttermilk.");
                System.out.println("3. 🥗 Fresh vegetables.");
                logActivity("Foods for Dry Scalp: 🥑Avocado, 🥜Nuts, 🥛Milk and Buttermilk, 🥗Veggies");
            }
            case "Oily Scalp" -> {
                System.out.println("1. 🍋 Citrus fruits.");
                System.out.println("2. 🍚 Low-fat rice, avoid fried food.");
                System.out.println("3. 🥒 Cucumber, water-rich veggies.");
                logActivity("Foods for Oily Scalp: 🍋Citrus fruits, 🍚Low-fat rice, 🥒Cucumber");
            }
            default -> logActivity("General diet tips for hair: Iron, Zinc, Omega-3, Protein");
        }

        System.out.println();
    }
}
