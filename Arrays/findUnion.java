import java.util.ArrayList;
import java.util.HashSet;

public class findUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6};

        // Using a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of arr1 to set
        for (int num : arr1) {
            set.add(num);
        }

        // Add all elements of arr2 to set
        for (int num : arr2) {
            set.add(num);
        }

        // Convert set to an ArrayList
        ArrayList<Integer> unionList = new ArrayList<>(set);

        // Print the union list
        System.out.println("Union of arrays: " + unionList);
        System.out.println("Length of union : "+set.size());
    }
}
