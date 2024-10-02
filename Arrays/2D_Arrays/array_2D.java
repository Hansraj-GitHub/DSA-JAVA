
import java.util.Arrays;
import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the value in 3*3 matrix");

        // input

        for( int rows=0; rows < arr.length ;rows++) {
            for(int cols = 0; cols < arr[rows].length; cols++) {
                arr[rows][cols]= sc.nextInt();
                
            } 
            
        }

        // output

         for( int rows=0; rows < arr.length ;rows++) {
            // for(int cols = 0; cols < arr[rows].length; cols++) {
            //     System.out.print(arr[rows][cols]+ " ");
                
            // } 
            // System.out.println();
            System.out.println(Arrays.toString(arr[rows]));
        
        }
    }
    
}
