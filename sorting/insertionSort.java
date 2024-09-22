import java.util.Scanner;

public class insertionSort{
    public static void main(String[] args) {
        // int[] arr = {5,2,36,15,12,1};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        insertion(arr);
        for ( int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void insertion(int[] arr) {
        for ( int i = 0 ; i <= arr.length -1 ; i++){
            int j = i;

            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}