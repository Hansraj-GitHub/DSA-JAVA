public class moveZeroes {

    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
            
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        moveZeroes solution = new moveZeroes();
        
        int[] nums1 = {0, 1, 0, 3, 0,12};
        solution.moveZeroes(nums1);
        for (int num : nums1) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
