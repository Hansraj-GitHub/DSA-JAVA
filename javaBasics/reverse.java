import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.print("Enter no: ");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int ans=0;
        while(num>0) {
            int rem = num%10;
            num=num/10;
            ans=ans*10+rem;
        }
        System.out.println("reverse no is: "+ ans);
    }
}