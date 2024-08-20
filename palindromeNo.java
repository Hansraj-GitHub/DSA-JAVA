public class palindromeNo {
    public static void main(String[] args) {
        int n = 12321;
        int originalNum = n;
        int reverse = 0;

        
        while ( n!= 0) {
            int temp = n%10;
            reverse = reverse * 10 + temp;
            n= n/10;

        }
            
        if(originalNum==reverse){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
       
    }
}
