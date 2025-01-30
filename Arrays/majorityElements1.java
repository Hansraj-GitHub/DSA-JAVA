public class majorityElements1 {
        public static int majorityElement(int[] arr) {
            int n = arr.length;
            int candidate = -1, count = 0;
    
            for (int num : arr) {
                if (count == 0) {
                    candidate = num;
                    count = 1;
                } else if (num == candidate) {
                    count++;
                } else {
                    count--;
                }
            }

            count = 0;
            for (int num : arr) {
                if (num == candidate) {
                    count++;
                }
            }
    
            return (count > n / 2) ? candidate : -1;
        }
    
        public static void main(String[] args) {
            int[] arr = {3, 1, 3, 3, 2};
            System.out.println(majorityElement(arr));
            
        }
}
    

