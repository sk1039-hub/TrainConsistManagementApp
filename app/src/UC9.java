import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

public class UC9 {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("Sleeper", 70)); // duplicate type
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("AC Chair", 60));

        System.out.println("=== Original Bogie List ===");
        bogieList.forEach(Bogie::display);

        // Step 2: Group bogies by type (name)
        Map<String, List<Bogie>> groupedBogies = bogieList.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Step 3: Display grouped result
        System.out.println("\n=== Grouped Bogies by Type ===");

        if (groupedBogies.isEmpty()) {
            System.out.println("No bogies available.");
        } else {
            for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
                System.out.println("\nType: " + entry.getKey());

                for (Bogie b : entry.getValue()) {
                    b.display();
                }
            }
        }

        // Verify original list unchanged
        System.out.println("\n=== Original List After Grouping (Unchanged) ===");
        bogieList.forEach(Bogie::display);

        System.out.println("\nProgram continues...");
    }
}