public class maximuProductSubArray {
        public static int maxProduct(int[] arr) {
            int n = arr.length;
            if (n == 0) return 0;
    
            int maxProduct = arr[0], minProduct = arr[0], result = arr[0];
    
            for (int i = 1; i < n; i++) {
                if (arr[i] < 0) {
                    // Swap maxProduct and minProduct when encountering a negative number
                    int temp = maxProduct;
                    maxProduct = minProduct;
                    minProduct = temp;
                }
    
                // Update maxProduct and minProduct
                maxProduct = Math.max(arr[i], maxProduct * arr[i]);
                minProduct = Math.min(arr[i], minProduct * arr[i]);
    
                // Update the final result
                result = Math.max(result, maxProduct);
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            int[] arr1 = {-2, 6, -3, -10, 0, 2};
            int[] arr2 = {-1, -3, -10, 0, 6};
            int[] arr3 = {2, 3, 4};
    
            System.out.println(maxProduct(arr1)); // Output: 180
            System.out.println(maxProduct(arr2)); // Output: 30
            System.out.println(maxProduct(arr3)); // Output: 24
        }
}
    

