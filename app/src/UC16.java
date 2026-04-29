public class UC16 {

    public static void main(String[] args) {

        // Passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("=== Original Capacities ===");
        printArray(capacities);

        // Bubble Sort (Ascending Order)
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped) {
                break;
            }
        }

        System.out.println("\n=== Sorted Capacities (Bubble Sort) ===");
        printArray(capacities);

        System.out.println("\nProgram continues...");
    }

    // Helper method to print array
    static void printArray(int[] arr) {
        for (int cap : arr) {
            System.out.print(cap + " ");
        }
        System.out.println();
    }
}