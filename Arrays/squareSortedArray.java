
import java.util.Arrays;

public class squareSortedArray{
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,2,3,5};
        int[] result = sortedSquares(nums);

        System.out.println(Arrays.toString(result));        
    }
    public static int[] sortedSquares(int[] nums) {

        int[] newArray = new int[nums.length];
        
        for ( int i = 0 ; i < nums.length; i++){
            int square = nums[i] * nums[i];
            newArray[i] = square;
        }
        Arrays.sort(newArray);
        return newArray;
    }
}