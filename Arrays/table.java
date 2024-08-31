import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any no: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for( int j=1;j<=10;j++){
            
                int result =i*j;
                System.out.print(result+ " ");
               //System.out.println(n + " * " + i + " = " + result);
            }
            
            System.out.println();
        }
    }
    
}
