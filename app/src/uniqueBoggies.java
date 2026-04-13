import java.util.HashSet;
import java.util.Set;

public class uniqueBoggies {

    public static void main(String[] args) {

        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG104");
        bogieIds.add("BG102"); // duplicate

        // Display final set
        System.out.println("Unique Bogie IDs in Train Consist:");
        for (String id : bogieIds) {
            System.out.println(id);
        }
    }
}