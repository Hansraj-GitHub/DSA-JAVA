
import java.util.Scanner;

public class print1toN{

    static int n;
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(1,n);
    }

    public static void print(int i , int n){
        if ( i > n){
            return;
        }else{
            System.out.println(i);
            print(i+1,n);
        }
    
        
       
    }
}