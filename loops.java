import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter no "+i+":");
            arr[i] =sc.nextInt();
        }
        System.out.print("Your Numbers are :");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
            
        }
        int number=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>number){
                number=arr[i];
            }
        }
        System.out.println("your largest no is: "+ number);
        
    }
}
