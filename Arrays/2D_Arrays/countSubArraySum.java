import java.util.HashMap;

public class countSubArraySum {
    public static int subarraySum(int[] nums, int k) {
        // HashMap to store the cumulative sum and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize with cumulative sum 0 (to handle subarrays starting from index 0)
        
        int count = 0;
        int sum = 0;
        
        for (int num : nums) {
            sum += num; // Add current element to cumulative sum
            
            // Check if there exists a subarray whose sum is sum - k
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            
            // Update the frequency of the cumulative sum in the map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        
        // Example 2
        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println("Output: " + subarraySum(nums2, k2)); // Output: 2
    }
}
