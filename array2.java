import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter no: ");
        int[] number= new int[5];
        int s= 0;

        // input using for loop

        for ( int i =0; i < number.length ; i++ ) {
        number[i] = sc.nextInt();
            s = s + number[i];
        }
        System.out.println("answer is: "+ s );
        System.out.println(Arrays.toString(number));
    }
    
}
