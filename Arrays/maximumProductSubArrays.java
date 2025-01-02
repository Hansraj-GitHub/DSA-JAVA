public class maximumProductSubArrays {
        public static int maxProduct(int[] nums) {
            
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0]; 
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // Swap currentMax and currentMin if num is negative
            if (num < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            // Update currentMax and currentMin
            currentMax = Math.max(num, currentMax * num);
            currentMin = Math.min(num, currentMin * num);

            // Update maxProduct
            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, -2, 4};
        System.out.println("Output: " + maxProduct(nums1)); // Output: 6
    }
}
