
import java.util.Scanner;

public class SkinCare extends SelfCareArea {

    public SkinCare(String userName) {
        super(userName);
    }

    @Override
    public String chooseSubCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your skin type:");
        System.out.println("1. Oily Skin 🛢️\n2. Dry Skin 🌵\n3. Combination (Oily-Dry) Skin 🌗\n4. Acne prone Skin 🔴");
        int choice = sc.nextInt();
        sc.nextLine();

        selectedIssue = switch (choice) {
            case 1 -> "Oily Skin";
            case 2 -> "Dry Skin";
            case 3 -> "Combination Skin";
            case 4 -> "Acne prone Skin";
            default -> "Invalid";
        };

        System.out.println("You selected: " + selectedIssue);
        logActivity("Skin Category: " + selectedIssue);
        return selectedIssue;
    }

    @Override
    public void suggestHomeRemedies() {
        System.out.println("   🏠 Skin Care Home Remedies   ");
        switch (selectedIssue) {
            case "Oily Skin":
                System.out.println("1. 🧱 Multani Mitti (Fuller’s Earth) face pack");
                System.out.println("2. 🌿 Aloe Vera Gel");
                System.out.println("3. 🍋 Lemon juice with 🍯 honey");
                System.out.println("4. 🥒 Cucumber juice");
                System.out.println("5. 🍵 Green tea toner");
                logActivity("Home Remedies for Oily Skin:🧱 Multani Mitti, 🌿 Aloe Vera Gel, 🍋 Lemon juice with 🍯 honey, 4. 🥒 Cucumber juice, 🍵 Green tea toner");
                break;

            case "Dry Skin":
                System.out.println("1. 🍯 Use honey as a natural moisturizer");
                System.out.println("2. 🥥 Coconut oil or 🧈 Ghee");
                System.out.println("3. 🌾 Oatmeal bath or paste");
                System.out.println("4. 🍌 Banana mash with honey");
                System.out.println("5. 🥛 Milk cream – softens and moisturizes skin");
                logActivity("Home Remedies for Dry Skin:🍯 Use honey as a natural moisturizer, 🥥 Coconut oil or 🧈 Ghee, 🌾 Oatmeal bath or paste, 🍌 Banana mash with honey, 🥛 Milk cream");
                break;

            case "Combination Skin":
                System.out.println("1. 🌿 Aloe vera with 🍯 honey");
                System.out.println("2. 🌹 Rosewater toner");
                System.out.println("3. 🧖‍♀️ Clay mask (only on T-zone)");
                System.out.println("4. 🥒 Cucumber + 🍦 yogurt mask");
                System.out.println("5. 🍵 Green tea spray");
                logActivity("Home Remedies for Combination Skin:🌿 Aloe vera with 🍯 honey, 🌹 Rosewater toner, 🧖‍♀️ Clay mask , 🍵 Green tea spray");
                break;

            case "Acne prone Skin":
                System.out.println("1. 🌿 Neem paste or neem water toner (anti-bacterial)");
                System.out.println("2. 🌱 Tea tree oil (diluted)");
                System.out.println("3. 🌿 Aloe vera + 🌼 turmeric paste");
                System.out.println("4. 🍯 Honey and 🌰 cinnamon mask");
                System.out.println("5. ❄️ Ice cubes wrapped in cloth");
                logActivity("Home Remedies for Acne-prone Skin:🌿 Neem paste, 🌱 Tea tree oil (diluted), Aloe vera + 🌼 turmeric paste, 🍯 Honey and 🌰 cinnamon mask, ❄️ Ice cubes wrapped in cloth");
                break;
        }
        System.out.println();

    }

    @Override
    public void suggestMedicalRemedies() {
        System.out.println("   💊 Skin Care Medical Remedies   ");
        switch (selectedIssue) {
            case "Oily Skin":
                System.out.println("1. 🧴 Use salicylic acid face wash (controls oil & acne)");
                System.out.println("2. 💊 Niacinamide-based serums for oil control");
                System.out.println("3. 💧 Water-based moisturizers (non-comedogenic)");
                System.out.println("4. 🧼 Use clay-based masks (dermatologist-approved)");
                System.out.println("5. 📋 Regular exfoliation with BHA (2-3 times a week)");
                logActivity("Medical Remedies for Oily Skin: 🧴Salicylic acid face wash, 💊Niacinamide serum, 💧Water-based moisturizers, 🧼Clay-based masks, 📋BHA exfoliation");
                break;

            case "Dry Skin":
                System.out.println("1. 🧴 Ceramide-based moisturizers for skin barrier repair");
                System.out.println("2. 💧 Hyaluronic acid serums for deep hydration");
                System.out.println("3. ❌ Avoid alcohol-based products");
                System.out.println("4. 🧼 Use gentle, fragrance-free cleansers");
                System.out.println("5. 💊 Omega-3 or Vitamin E supplements (consult doctor)");
                logActivity("Medical Remedies for Dry Skin: 🧴Ceramide moisturizers, 💧Hyaluronic acid serums, ❌Avoid alcohol-based products, 🧼Gentle cleansers,💊 Omega-3/Vitamin E supplements");
                break;

            case "Combination Skin":
                System.out.println("1. 🧴 Use gel-based moisturizers (balance oily & dry zones)");
                System.out.println("2. 💊 Zinc-based treatments for the T-zone");
                System.out.println("3. 🧽 Gentle exfoliants with AHAs");
                System.out.println("4. 💧 Spot-treat oily areas and hydrate dry parts");
                System.out.println("5. 🧼 Use balanced pH cleansers");
                logActivity("Medical Remedies for Combination Skin: 🧴Gel-based moisturizers, 💊Zinc treatments,🧽 AHA exfoliants,💧 Spot-treating, 🧼Balanced pH cleansers");
                break;

            case "Acne prone Skin":
                System.out.println("1. 🧴 Salicylic acid or benzoyl peroxide treatments");
                System.out.println("2. 💊 Retinoid creams (consult dermatologist)");
                System.out.println("3. 🧼 Medicated face washes for acne-prone skin");
                System.out.println("4. 💉 Oral antibiotics for severe acne (prescription only)");
                System.out.println("5. 💊 Zinc or Vitamin A supplements (under medical advice)");
                logActivity("Medical Remedies for Acne prone Skin: 🧴Salicylic acid/Benzoyl peroxide,💊Retinoids, 🧼Medicated face wash, 💉Oral antibiotics, 💊Zinc/Vitamin A supplements");
                break;
        }
        System.out.println();
    }


    @Override
    public void suggestFoods() {
        System.out.println("   🍽️ Recommended Foods for Skin   ");
        switch (selectedIssue) {
            case "Oily Skin" : {
                System.out.println("1. 🥒 Cucumber and leafy greens.");
                System.out.println("2. 💧 Drink plenty of water.");
                System.out.println("3. 🍎 Apples and pears.");
                logActivity("Foods for Oily Skin: 🥒Cucumber, 🥬Leafy greens,💧 Water, 🍎Apples, 🍐Pears");
                break;
            }
            case "Dry Skin" : {
                System.out.println("1. 🥑 Avocados and olive oil.");
                System.out.println("2. 🐟 Omega-3 rich foods (salmon).");
                System.out.println("3. 🥛 Milk and dairy for hydration.");
                logActivity("Foods for Dry Skin: 🥑Avocados, 🫒Olive oil, 🐟Omega-3 (salmon), 🥛Milk and Dairy");
                break;
            }
            case "Acne prone Skin" : {
                System.out.println("1. 🥦 Broccoli and spinach.");
                System.out.println("2. 🍊 Vitamin C-rich fruits.");
                System.out.println("3. 🍚 Whole grains, avoid sugar.");
                logActivity("Foods for Acne prone Skin: 🥦Broccoli, 🥬Spinach, 🍊Vitamin C fruits, 🍚Whole grains");
                break;
            }
            case "Combination Skin" : {
                System.out.println("1. 🍅 Tomatoes, cucumber, and berries.");
                System.out.println("2. 🥒 Water-rich foods + moderate dairy.");
                System.out.println("3. 🍚 Whole grains + flaxseeds.");
                logActivity("Foods for Combination Skin: 🍅Tomatoes, 🍒🍓🫐Berries, 🥒🍉Water-rich foods, 🍚Whole grains and Flaxseeds");
                break;
            }
            default : logActivity("Food suggestion: General skin-friendly diet (Vitamin A, C, E rich)");
        }
        System.out.println();
    }

}
