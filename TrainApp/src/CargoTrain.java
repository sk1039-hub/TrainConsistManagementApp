import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CargoTrain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create HashMap to store bogie-capacity mapping
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        System.out.println("=== Train Consist Management System (UC6: Bogie-Capacity Mapping) ===");

        // User input for number of bogies
        System.out.print("Enter number of bogies to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Insert entries into HashMap
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter bogie name: ");
            String bogieName = scanner.nextLine();

            System.out.print("Enter capacity for " + bogieName + ": ");
            int capacity = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // put() method to store key-value pair
            bogieCapacityMap.put(bogieName, capacity);
        }

        // Display bogie-capacity mapping
        System.out.println("\n=== Bogie Capacity Details ===");

        // entrySet() iteration
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        System.out.println("\nProgram continues...");

        scanner.close();
    }
}