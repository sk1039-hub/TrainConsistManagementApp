import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;   // e.g., Cylindrical, Open, Box
    String cargo;  // e.g., Petroleum, Coal, Grain

    // Constructor
    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    // Display method
    void display() {
        System.out.println("Type: " + type + " | Cargo: " + cargo);
    }
}

public class UC12 {

    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> goodsList = new ArrayList<>();
        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsList.add(new GoodsBogie("Open", "Coal"));
        goodsList.add(new GoodsBogie("Box", "Grain"));
        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        System.out.println("=== Goods Bogie List ===");
        goodsList.forEach(GoodsBogie::display);

        // Step 2: Safety validation using stream
        boolean isSafe = goodsList.stream()
                .allMatch(b ->
                        // Rule: Cylindrical bogie must carry only Petroleum
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Step 3: Display result
        System.out.println("\n=== Safety Compliance Result ===");
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌ (Invalid cargo in cylindrical bogie)");
        }

        System.out.println("\nProgram continues...");
    }
}