public class UC20 {

    public static void main(String[] args) {

        // Step 1: Bogie IDs (try empty array to test exception)
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        String searchKey = "BG205";

        try {

            // Step 2: Validation (Fail-fast check)
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available in train. Search cannot be performed.");
            }

            // Step 3: Linear search after validation
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchKey)) {
                    found = true;
                    break;
                }
            }

            // Step 4: Output result
            if (found) {
                System.out.println("Search Result: SUCCESS ✔ Bogie Found");
            } else {
                System.out.println("Search Result: FAILED ❌ Bogie Not Found");
            }

        } catch (IllegalStateException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("\nProgram continues...");
    }
}