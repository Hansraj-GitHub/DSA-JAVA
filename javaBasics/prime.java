import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no: ");
        int n=sc.nextInt();
        int c=0,i=1;
        while(i<=n)
        {
            
            if(n%i==0){
                c++;
            }
            i++;
        }
        if(c==2){
            System.out.println("prime no: "+ n);
        } else {
            System.out.println(" not prime ");
        }
    
    }
    
}
