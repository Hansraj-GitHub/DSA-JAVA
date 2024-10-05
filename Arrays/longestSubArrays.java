import java.util.HashMap;

public class longestSubArrays{
    public static void main(String[] args) {
        int[] A = {1,2,3,1,1,1,1,4,2,3};
        int K = 10;
        int N = A.length;
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            // Update the cumulative sum
            sum += A[i];

            // Check if the cumulative sum equals K
            if (sum == K) {
                maxLength = i + 1; // Update maxLength if found from the start
            }

            // If sum - K exists in the map, we found a subarray with sum K
            if (sumMap.containsKey(sum - K)) {
                maxLength = Math.max(maxLength, i - sumMap.get(sum - K));
            }

            // Store the first occurrence of the cumulative sum
            sumMap.putIfAbsent(sum, i);
        }
        
        System.out.println(maxLength);
    }
}