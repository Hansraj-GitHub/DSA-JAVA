
import java.util.Scanner;

public class func_1 {
    public static void main(String[] args) {
        int answer = sum();
        System.out.println("Answer is = "+ answer);
    
    }       
    // return the value

    static int sum() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a: ");
        int a=sc.nextInt();
        System.out.print("enter b: ");
        int  b=sc.nextInt();
        int ans=a+b;
        return ans;

       // System.out.println("this will never execute");
    }
}
