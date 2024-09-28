
public class runningSum{
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4}; // output [1,3,6,10]
        int sum = 0;
        int[] newArray = new int[arr.length];
        for ( int i = 0; i < arr.length ; i++){
            sum = sum + arr[i];
            newArray[i] = sum; 

        }
        System.out.print("[");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", "); 
            }
        }
        System.out.print("]");
    }
}