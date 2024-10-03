
import java.util.Arrays;

public class rotateArray{
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,2,7,8};
        int n = arr.length ; 
        int temp = arr[0];
        for ( int i= 1; i < n ; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}