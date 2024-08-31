
import java.util.Scanner;

public class AllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no: ");
        int  n = sc.nextInt();
        long sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum = sum + i * (n/i);
        } 
        System.out.println("sum of Divisors is : "+ sum);
    }
}
