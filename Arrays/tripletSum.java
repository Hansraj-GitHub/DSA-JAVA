import java.util.Arrays;

public class tripletSum {
    public static boolean findTriplet(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    return true; 
                } else if (sum < target) {
                    left++;
                } else {
                    right--; 
                }
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 6, 7};
        int target = 10;
        System.out.println(findTriplet(arr, target)); 

    }
}
