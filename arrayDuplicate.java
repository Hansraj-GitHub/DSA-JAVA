import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayDuplicate {
    public static void main(String[] args) {
        int[] arr = {5, 4, 5, 8, 7, 5, 4, 6, 8,4,9,7};

        List<Integer> result = findDuplicates(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> findDuplicates(int[] arr) {
        int n = arr.length;

        // Find the max value in the array to properly size the frequency array
        int maxValue = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        // Frequency array should be of size maxValue + 1
        int[] frequency = new int[maxValue + 1];
        List<Integer> duplicates = new ArrayList<>();

        // Count frequencies of each element
        for (int i = 0; i < n; i++) {
            frequency[arr[i]]++;
        }

        // Collect elements that occur more than once
        for (int i = 0; i <= maxValue; i++) {
            if (frequency[i] > 1) {
                duplicates.add(i);
            }
        }

        // If no duplicates are found, return [-1]
        if (duplicates.isEmpty()) {
            duplicates.add(-1);
        }

        // Ensure the duplicates are returned in ascending order
        Collections.sort(duplicates);

        return duplicates;
    }
}
