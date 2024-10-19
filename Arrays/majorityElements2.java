import java.util.ArrayList;
import java.util.List;

public class majorityElements2 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;
        
        // Step 1: Identify two candidates
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        
        // Step 2: Verify the counts of candidates
        count1 = 0;
        count2 = 0;
        
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
        
        int n = nums.length;
        
        if (count1 > n / 3) {
            result.add(candidate1);
        }
        
        if (count2 > n / 3) {
            result.add(candidate2);
        }
        
        return result;
    }

    public static void main(String[] args) {
        majorityElements2 solution = new majorityElements2();

        int[] nums1 = {3,2,3,3,2,2,1,3};
        System.out.println(solution.majorityElement(nums1));  // Output: [3]
    }
}
