import java.util.HashMap;

public class largestSubArraySumZero {
    public static int largestZeroSumSubarray(int[] arr) {
        // Initialize a HashMap to store sum and index
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int sum = 0; // Cumulative sum
        int maxLen = 0; // Length of the largest subarray

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Update cumulative sum

            // Case 1: If sum is 0, update maxLen
            if (sum == 0) {
                maxLen = i + 1;
            }

            // Case 2: If sum is seen before, calculate subarray length
            if (sumMap.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - sumMap.get(sum));
            } else {
                // Case 3: Store sum with the current index
                sumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println("Output: " + largestZeroSumSubarray(arr)); // Output: 5
    }
}
