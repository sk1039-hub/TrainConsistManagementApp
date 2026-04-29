import java.util.ArrayList;
import java.util.List;

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

public class UC10 {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 70));

        System.out.println("=== Bogie List ===");
        bogieList.forEach(Bogie::display);

        // Step 2: Stream pipeline for aggregation
        int totalCapacity = bogieList.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // aggregate using reduce

        // Step 3: Display total seating capacity
        System.out.println("\n=== Total Seating Capacity ===");
        System.out.println("Total Seats in Train: " + totalCapacity);

        // Verify original list unchanged
        System.out.println("\n=== Original List After Aggregation (Unchanged) ===");
        bogieList.forEach(Bogie::display);

        System.out.println("\nProgram continues...");
    }
}