import java.util.Scanner;

public class sumAllDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no: ");
        int n = sc.nextInt();
        int sum = 0;
        for(;n!=0;n=n/10){
            sum = sum + n %10;

        }
            
        
        System.out.println(sum);
    }
}
