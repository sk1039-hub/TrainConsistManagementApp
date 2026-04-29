import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Define regex patterns
        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // Step 2: Compile patterns
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // Step 3: Take user input
        System.out.print("Enter Train ID: ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        // Step 4: Create matcher objects
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Step 5: Validate using matches()
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Step 6: Display results
        System.out.println("\n=== Validation Results ===");

        if (isTrainValid) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID (Expected format: TRN-1234)");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID (Expected format: PET-AB)");
        }

        System.out.println("\nProgram continues...");

        scanner.close();
    }
}