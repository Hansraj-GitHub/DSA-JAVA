
import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int number = sc.nextInt();

        int originalNum, remainder, result = 0, n = 0;
        originalNum = number;

        // Count the number of digits
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = number;

        // Calculate the sum of nth power of digits
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        // Check if the number is Armstrong
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

    }

}
