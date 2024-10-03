
import java.util.Arrays;

public class moveZeroInLast{
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,6,0,8,7,0,4};

        movesZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void movesZeros(int[] arr) {
        int j = -1;

        for ( int i = 0 ; i < arr.length ; i++){
            if (arr[i] == 0){
                j = i;
                break;
            }
        }

        for ( int i = j+1 ; i < arr.length ; i++){
            if ( arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }
}