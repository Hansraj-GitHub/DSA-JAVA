 import java.util.ArrayList;

class Solution {
    // Function to reverse every sub-array group of size k.
    void reverseArray(ArrayList<Long> arr, int k) {
        int n = arr.size();
        
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); // Ensure we don't go out of bounds
            
            // Reverse sublist from left to right
            while (left < right) {
                long temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }
    }

    // Driver Code for Testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        ArrayList<Long> arr1 = new ArrayList<>();
        arr1.add(1L);
        arr1.add(2L);
        arr1.add(3L);
        arr1.add(4L);
        arr1.add(5L);
        sol.reverseArray(arr1, 3);
        System.out.println(arr1); // Output: [3, 2, 1, 5, 4]

        ArrayList<Long> arr2 = new ArrayList<>();
        arr2.add(5L);
        arr2.add(6L);
        arr2.add(8L);
        arr2.add(9L);
        sol.reverseArray(arr2, 5);
        System.out.println(arr2); // Output: [9, 8, 6, 5]
    }
}


