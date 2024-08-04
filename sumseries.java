import java.util.Scanner;

public class sumseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int a=1;
        int d=1;
        long sumOfNumber = 1 ;
        if (n != 1){
            sumOfNumber = (n/2)*(n+1);
        }
        
        // int sumofno=n/2*(2*a+(n-1)*d);

        System.out.println("answer is: "+ sumOfNumber);
        

        

    }
}
