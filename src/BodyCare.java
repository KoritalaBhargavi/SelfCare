import java.util.Scanner;

public class BodyCare extends SelfCareArea {

    public BodyCare(String userName) {
        super(userName);
    }

    @Override
    public String chooseSubCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your body care concern:");
        System.out.println("1. Body Odor 🧼\n2. Dark Patches 🌑\n3. Stretch Marks 🤰\n4. Dry Skin");
        int choice = sc.nextInt();
        sc.nextLine();

        selectedIssue = switch (choice) {
            case 1 -> "Body Odor";
            case 2 -> "Dark Patches";
            case 3 -> "Stretch Marks";
            case 4 -> "Dry Skin";
            default -> "Invalid";
        };

        System.out.println("You selected: " + selectedIssue);
        logActivity("Body Care Category: " + selectedIssue);
        return selectedIssue;
    }

    @Override
    public void suggestHomeRemedies() {
        System.out.println("\n-- 🏠 Body Care Home Remedies --");

        switch (selectedIssue) {
            case "Body Odor" -> {
                System.out.println("1. 🍋 Lemon juice and baking soda for odor.");
                System.out.println("2. 🌿 Neem leaves boiled water bath.");
                System.out.println("3. 🧴 Apple cider vinegar diluted as deodorant.");
                logActivity("Home Remedies for Body Odor: 🍋Lemon + Baking Soda, 🌿Neem bath, 🧴Apple Cider Vinegar");
            }
            case "Dark Patches" -> {
                System.out.println("1. 🥣 Turmeric and besan paste.");
                System.out.println("2. 🥛 Milk and honey scrub.");
                System.out.println("3. 🍋 Lemon juice and aloe vera.");
                logActivity("Home Remedies for Dark Patches: 🥣Turmeric + Besan, 🥛Milk + Honey scrub, 🍋Lemon + Aloe");
            }
            case "Stretch Marks" -> {
                System.out.println("1. 🌱 Aloe vera gel or shea butter.");
                System.out.println("2. 🥥 Coconut oil massage.");
                System.out.println("3. 🍋 Lemon juice and sugar scrub.");
                logActivity("Home Remedies for Stretch Marks: 🌱Aloe vera, 🥥Coconut oil, 🍋Lemon + Sugar scrub");
            }
            case "Dry Skin" -> {
                System.out.println("1. 🥥 Coconut oil or ghee.");
                System.out.println("2. 🍯 Honey as natural moisturizer.");
                System.out.println("3. 🥑 Avocado + yogurt mask.");
                logActivity("Home Remedies for Dry Skin: 🥥Coconut oil/Ghee, 🍯Honey, 🥑Avocado + Yogurt mask");
            }
        }

        System.out.println();
    }

    @Override
    public void suggestMedicalRemedies() {
        System.out.println("-- 💊 Body Care Medical Remedies --");

        switch (selectedIssue) {
            case "Body Odor" -> {
                System.out.println("1. 🧴 Antifungal powders or clinical deodorants.");
                System.out.println("2. 💊 Antibiotics if caused by bacteria (consult doctor).");
                System.out.println("3. 💉 Botox injections for excessive sweating.");
                logActivity("Medical Remedies for Body Odor: 🧴Antifungal powder, 💊Antibiotics (if needed), 💉Botox for sweat");
            }
            case "Dark Patches" -> {
                System.out.println("1. 💊 Skin-lightening creams (consult dermatologist).");
                System.out.println("2. 💉 Chemical peels or laser treatment.");
                System.out.println("3. 💊 Retinol or Vitamin C-based serums.");
                logActivity("Medical Remedies for Dark Patches: 💊Lightening creams, Chemical peels, Retinol/Vit C");
            }
            case "Stretch Marks" -> {
                System.out.println("1. 🧴 Retinoid creams.");
                System.out.println("2. 💉 Microdermabrasion or laser therapy.");
                System.out.println("3. 🧴 Hyaluronic acid topical treatments.");
                logActivity("Medical Remedies for Stretch Marks: 🧴Retinoid creams, 💉Laser therapy, 🧴Hyaluronic acid");
            }
            case "Dry Skin" -> {
                System.out.println("1. 🧴 Ceramide-based moisturizers.");
                System.out.println("2. 💊 Omega-3 supplements.");
                System.out.println("3. 🧼 Mild soap-free cleansers.");
                logActivity("Medical Remedies for Dry Skin: 🧴Ceramide moisturizer, 💊Omega-3, 🧼Soap-free cleansers");
            }
        }

        System.out.println();
    }

    @Override
    public void suggestFoods() {
        System.out.println("-- 🍽️ Recommended Foods for Body Care --");

        switch (selectedIssue) {
            case "Body Odor" -> {
                System.out.println("1. 🥗 Leafy greens.");
                System.out.println("2. 🍊 Citrus fruits.");
                System.out.println("3. 💧 Hydration (drink plenty of water).");
                logActivity("Foods for Body Odor: 🥗Leafy greens, 🍊Citrus fruits, 💧Water");
            }
            case "Dark Patches" -> {
                System.out.println("1. 🥕 Vitamin A-rich foods (carrots, spinach).");
                System.out.println("2. 🥭 Vitamin C-rich fruits (mango, papaya).");
                System.out.println("3. 🥥 Coconut water and fresh juices.");
                logActivity("Foods for Dark Patches: 🥕Vitamin A & 🥭C fruits,🥥Coconut water");
            }
            case "Stretch Marks" -> {
                System.out.println("1. 🥑 Avocados and seeds.");
                System.out.println("2. 🥛 Milk and protein-rich foods.");
                System.out.println("3. 🍓 Berries for collagen boost.");
                logActivity("Foods for Stretch Marks: 🥑Avocados, 🥛Milk, 🍓Berries");
            }
            case "Dry Skin" -> {
                System.out.println("1. 🥜 Nuts and seeds.");
                System.out.println("2. 🐟 Fatty fish (salmon).");
                System.out.println("3. 🥥 Coconut and olive oil.");
                logActivity("Foods for Dry Skin: 🥜Nuts, 🐟Fatty fish, 🥥Coconut oil");
            }
        }

        System.out.println();
    }
}
