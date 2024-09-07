
    import java.util.Arrays;

    public class noSmalllerThanCurrent{
        public static void main(String[] args) {
            int[] nums = {8,1,2,2,3};  // [4,0,1,1,3]
            
            int[] emptyArray = new int[nums.length];
            for ( int i = 0 ; i < nums.length ; i++){
                int result = 0;
                for ( int j = 0 ; j < nums.length; j++){
                    if ( nums[j] < nums[i]){
                        result++;
                    }
                }
                emptyArray[i] = result;
            }
            System.out.println(Arrays.toString(emptyArray));

        }
    }