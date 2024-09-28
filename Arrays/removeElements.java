public class removeElements { 
    public static void main(String[] args) {
        int[] nums = {2,3,3,2,4,6};
        int val = 3;
        int count = 0;
        
        for ( int i = 0; i < nums.length ; i++){
            if ( nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        System.out.println(count);
    }
        
}
