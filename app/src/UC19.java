import java.util.Arrays;

public class UC19 {

    public static void main(String[] args) {

        // Step 1: Bogie IDs (may be unsorted input)
        String[] bogieIds = {
                "BG309",
                "BG101",
                "BG550",
                "BG205",
                "BG412"
        };

        String searchKey = "BG205";

        System.out.println("=== Original Bogie IDs ===");
        System.out.println(Arrays.toString(bogieIds));

        // Step 2: Sort array (Binary Search precondition)
        Arrays.sort(bogieIds);

        System.out.println("\n=== Sorted Bogie IDs ===");
        System.out.println(Arrays.toString(bogieIds));

        // Step 3: Binary Search initialization
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Step 4: Binary Search logic
        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(searchKey);

            if (comparison == 0) {
                System.out.println("\nBogie Found at index: " + mid);
                found = true;
                break;
            }
            else if (comparison < 0) {
                low = mid + 1; // search right half
            }
            else {
                high = mid - 1; // search left half
            }
        }

        // Step 5: Result output
        if (found) {
            System.out.println("Search Result: SUCCESS ✔ Bogie exists.");
        } else {
            System.out.println("Search Result: FAILED ❌ Bogie not found.");
        }

        System.out.println("\nProgram continues...");
    }
}