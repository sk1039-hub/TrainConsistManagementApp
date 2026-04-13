import java.util.ArrayList;
import java.util.List;

public class PassengerBoggie {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize Train
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // UC2: Passenger Bogie Operations
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes Sleeper exist? " + exists);

        // Final list
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}
