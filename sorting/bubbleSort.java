
import java.util.Scanner;

public class bubbleSort{
    public static void main(String[] args) {
        // int[] arr = {12,8,25,19,56,32};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        
        bubble(arr);

        for ( int  i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

     public static void bubble(int[] arr){
        for ( int i = arr.length-1 ; i > 0 ; i--){
            for (int j = 0 ; j < i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}