// Step 1: Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Step 2: Passenger Bogie Class
class PassengerBogie {
    String type;
    int capacity;

    // Constructor with validation
    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    void display() {
        System.out.println("Bogie: " + type + " | Capacity: " + capacity);
    }
}

// Step 3: Main Class
public class UC14 {

    public static void main(String[] args) {

        try {
            // Valid bogies
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 56);

            b1.display();
            b2.display();

            // Invalid bogie (will throw exception)
            PassengerBogie b3 = new PassengerBogie("First Class", 0);
            b3.display(); // will not execute

        } catch (InvalidCapacityException e) {
            System.out.println("\nException Caught: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}