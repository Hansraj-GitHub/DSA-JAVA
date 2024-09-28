

public class missingNumber {
    public static void main(String[] args) {
       int arr[] = {1,2,3,5};
       int n = 5;
       int missingNumber = 0;
       int expectedsum = n * (n+1) / 2;
       int actualsum = 0;

        for( int i = 0 ; i < arr.length ; i++) {
            actualsum = actualsum + arr[i];
        }
        missingNumber = expectedsum - actualsum;
        System.out.println(missingNumber);
    }       
    
}
