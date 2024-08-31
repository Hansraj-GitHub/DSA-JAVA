

public class two_sum {
    public static void main(String[] args) {
        int[] nums = {2,4,5,9};
        int target = 13;
        
        for( int i = 0 ; i < nums.length ; i++) {
            for ( int j = i +1; j < nums.length ; j++){
                if (nums[i]+nums[j] == target){
                    System.out.println("[" + i + ", " + j + "]");
                }
            }
        }
    }
}
