// https://leetcode.com/problems/concatenation-of-array/description/

public class concatenationArray{
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] newNums = new  int[2 * nums.length];

        for( int i = 0; i < nums.length ; i++){
            newNums[i] = nums[i];
            newNums[i + nums.length] = nums[i];
        }
        for (int i = 0; i < newNums.length; i++) {
            System.out.print(newNums[i] + " ");
        }
    }
}

//  output =[1,2, 1, 1, 2, 1]
