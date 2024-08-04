import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        sum();
    }
    static void sum() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a: ");
        int a=sc.nextInt();
        System.out.print("enter b: ");
        int  b=sc.nextInt();
        int ans=a+b;
        System.out.println("answer is = "+ ans);
    }
}
