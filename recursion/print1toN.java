
import java.util.Scanner;

public class print1toN{

   static int count = 1;
   static int n;
    public static void main(String[] args) {
        System.out.print("Enter any No : ");
        Scanner sc = new  Scanner(System.in);
        n = sc.nextInt();
        print();
    }

    public static void print(){
        
        if ( count > n){
            return;
        }else{
            System.out.println(count);
            count++;
            print();
    
        }
       
    }
}