import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ascendingNo {
    public static void main(String[] args) {

        // Ascending order

        int arr[] = {5,8,2,15,1,25};
        Arrays.sort(arr);
        System.out.println("Ascending order is: "+Arrays.toString(arr));

        // Descending order

        Integer number[] = {5,8,2,15,1,25};
        Arrays.sort(number);
        Collections.reverse(Arrays.asList(number));
        System.out.println("Descending order is: "+Arrays.toString(number));

        
    }
}
