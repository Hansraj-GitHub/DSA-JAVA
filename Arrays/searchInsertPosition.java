public class searchInsertPosition{
    public static void main(String[] args) {
        int[] nums = {2,6,4,7,9};
        int target = 7;
        System.out.println(serachPosition(nums, target));
    }
        
    private static int  serachPosition(int[] nums , int target) {
        for ( int i = 0; i < nums.length ;i++){
            if ( nums[i] >= target){
               return i;
            }
            
        }
        return nums.length;
    }
}