
import java.util.Scanner;

public class printNto1{
    static int n;
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(n,n);
    }

    public static void print(int i , int n){
        if ( i < 1){
            return;
        }else{
            System.out.println(i);
            print(i-1,n);
        }
       
    }
}