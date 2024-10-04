
import java.util.Scanner;

public class singleNumber{
    public static void main(String[] args) {
        System.out.print("Enter Size of an array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter Elements :");

        // Initialize the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
          
        // Read the array elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result^arr[i];
        }
        System.out.println("Enter the single Elements :" + result);
    }
}

