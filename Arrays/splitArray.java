import java.util.Arrays;

public class splitArray{
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 2, 3, 4};
        System.out.println(canSplit(nums1));

        int[] nums2 = {1, 1, 1, 1};
        System.out.println(canSplit(nums2));  
    }

    public static boolean canSplit(int[] nums) {
        Arrays.sort(nums);
        
        int distinctCount = 0;
        int currentCount = 1;  

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > 2) {
                    return false;
                }
                distinctCount++; 
                currentCount = 1;  
            }
        }

        if (currentCount > 2) {
            return false;
        }
        distinctCount++;  

        return distinctCount >= nums.length / 2;
    }
}
