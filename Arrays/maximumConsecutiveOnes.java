public class maximumConsecutiveOnes{
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,1,1,0,1,0,1,1,1,1,0,1};
        System.out.println(findMaximumConsecutiveOnes(arr)
        );
    }

    public static int findMaximumConsecutiveOnes(int[] nums){
        int count = 0;
        int maximum = 0;

        for (int i = 0 ; i < nums.length; i++){
            if ( nums[i] == 1){
                count++;
                maximum = Math.max(maximum,count);
            }else{
                count = 0;
            }
        }
        return maximum;
    
    }
}