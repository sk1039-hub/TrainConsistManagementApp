import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

public class UC8 {

    public static void main(String[] args) {

        // Step 1: Create list of bogies (same as UC7)
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Luxury AC", 80));

        System.out.println("=== Original Bogie List ===");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Step 2: Apply Stream filtering (capacity > 60)
        List<Bogie> filteredBogies = bogieList.stream()
                .filter(b -> b.capacity > 60)   // filtering condition
                .collect(Collectors.toList()); // collect into new list

        // Step 3: Display filtered bogies
        System.out.println("\n=== Filtered Bogies (Capacity > 60) ===");
        if (filteredBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            for (Bogie b : filteredBogies) {
                b.display();
            }
        }

        // Verify original list unchanged
        System.out.println("\n=== Original List After Filtering (Unchanged) ===");
        for (Bogie b : bogieList) {
            b.display();
        }

        System.out.println("\nProgram continues...");
    }
}