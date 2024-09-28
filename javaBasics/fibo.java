
import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        System.out.print("Enter any index no: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println("Enter any index no: ");
        int a=0;
        int b=1;
        int count=2;
        while(count<=n) {
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }

        System.out.println("fibonacci no is: "+ b);
    }
    
}
