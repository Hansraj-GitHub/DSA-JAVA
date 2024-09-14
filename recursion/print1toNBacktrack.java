
import java.util.Scanner;

public class print1toNBacktrack{
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        func(n, n);
    }

    public static void func(int i , int n){
        if ( i < 1){
            return;
        }else {
            func(i-1,n);
            System.out.println(i);
        }
    }
}