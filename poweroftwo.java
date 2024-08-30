
import java.util.Scanner;

public class poweroftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no :");
        int n = sc.nextInt();
        boolean isPowerOfTwo = n > 0;
        while (n > 1 && n % 2 == 0) {
            n = n / 2;
        }
        isPowerOfTwo = isPowerOfTwo && (n == 1);
        System.out.println(isPowerOfTwo);

    }
}
