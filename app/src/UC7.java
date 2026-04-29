import java.util.ArrayList;
import java.util.Comparator;
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

public class UC7 {

    public static void main(String[] args) {

        // Create list to store bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Add passenger bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        System.out.println("=== Before Sorting ===");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Sort using Comparator (by capacity)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\n=== After Sorting (Ascending by Capacity) ===");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Optional: Descending order
        bogieList.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\n=== After Sorting (Descending by Capacity) ===");
        for (Bogie b : bogieList) {
            b.display();
        }

        System.out.println("\nProgram continues...");
    }
}