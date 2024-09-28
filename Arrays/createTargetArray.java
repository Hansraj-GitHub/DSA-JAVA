import java.util.ArrayList;
import java.util.List;

public class createTargetArray {
    public static void main(String[] args) {
        // Test case 1
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] result = createTargetArray(nums, index);
        
        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();  // To store the target array

        // Traverse both arrays
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);  // Insert nums[i] at position index[i]
        }

        // Convert List<Integer> to int[]
        int[] result = new int[target.size()];
        for (int i = 0; i < target.size(); i++) {
            result[i] = target.get(i);  // Copy elements to result array
        }

        return result;  // Return the final target array
    }
}
