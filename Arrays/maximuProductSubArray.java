public class maximuProductSubArray {
        public static int maxProduct(int[] arr) {
            int n = arr.length;
            if (n == 0) return 0;
    
            int maxProduct = arr[0], minProduct = arr[0], result = arr[0];
    
            for (int i = 1; i < n; i++) {
                if (arr[i] < 0) {
                    int temp = maxProduct;
                    maxProduct = minProduct;
                    minProduct = temp;
                }
    
                maxProduct = Math.max(arr[i], maxProduct * arr[i]);
                minProduct = Math.min(arr[i], minProduct * arr[i]);
    
                result = Math.max(result, maxProduct);
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            int[] arr = {-2, 6, -3, -10, 0, 2};
            System.out.println(maxProduct(arr)); // Output: 180
        }
}
    

