import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("enter any three no:");
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     if (a>b && a>c)
     System.out.print("a is largest: "+a);
     else if(b>a && b>c)
     System.out.print("b is largest: "+b);   
     else
     System.out.print("c is greatest: "+c);
    }
    
}
