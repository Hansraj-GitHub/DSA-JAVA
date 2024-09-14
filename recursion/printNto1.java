
import java.util.Scanner;

public class printNto1{
    static int n;
   
  
    public static void main(String[] args) {
        System.out.print("Enter any No : ");
        Scanner sc = new  Scanner(System.in);
        n = sc.nextInt();
        print();
    }

    public static void print(){
        
        if ( n<1){
            return;
        }else{
            System.out.println(n);
            n--;    
            print();
    
        }
       
    }
}