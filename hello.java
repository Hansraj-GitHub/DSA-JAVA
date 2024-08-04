
import java.util.Scanner;

class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        double n=sc.nextInt();
        double result = factorial(n);
        
        System.out.println("Factorial = " + result);
    }

    public static double factorial(double n){
        if (n==0){
            return 1;
        }
        return n * factorial(n-1);

    }
}
