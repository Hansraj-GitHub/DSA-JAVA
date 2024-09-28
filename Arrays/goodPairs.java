public class goodPairs{
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3}; // output 4
        int result = 0;
        for ( int i = 0; i < nums.length ; i++){
            for ( int j = i+1 ; j < nums.length ; j++){
                if ( nums[i] == nums[j]){
                    result++;
                }
            }
        }
        System.out.println(result);

    }
}