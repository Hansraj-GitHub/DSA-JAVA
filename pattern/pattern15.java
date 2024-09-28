public class pattern15{
    public static void main(String[] args) {
        int n = 5;
        for( int i = 0 ; i <= n ; i++){
            for ( char ch = 'A' ; ch <= 'A' + (n-i-1 )  ; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}


        // output

        /*
         
            A B C D E 
            A B C D 
            A B C 
            A B 
            A  

        
         */