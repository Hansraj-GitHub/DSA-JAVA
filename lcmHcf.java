
import java.util.Scanner;

public class lcmHcf {
    public static void main(String[] args) {
        System.out.println("Enter any two No : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
        int gcd = a;
        int bTemp = b;
        while (bTemp != 0) {
            int temp = bTemp;
            bTemp = gcd % bTemp;
            gcd = temp;
        }

        // Calculate LCM
        int lcm = (a * b) / gcd;

        // Print the results
        System.out.println("LCM: " + lcm + ", GCD: " + gcd);
    }
}
