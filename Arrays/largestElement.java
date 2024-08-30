
import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no :");
               
        // int arr[] = { 10,7,15,9,25,80,70,777,56,90};
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            if ( arr[i] > largest) {
                largest = arr[i];
            }
           
        }  
        System.out.println("Largest no is: "+largest);
    }
}
