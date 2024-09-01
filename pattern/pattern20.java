public class pattern20{
    public static void main(String[] args) {
        int n = 5;
        for( int i = 0; i< n ; i++){
            // star
            for ( int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }

            //space
            for ( int j = 0; j < 2*n-(2*i+2); j++){
                System.out.print(" ");
            }
            // star
            for ( int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for( int i = 0; i < n-1; i++){
            //star
            for ( int j = 1; j < n-i ;j++ ){
                System.out.print("*");
            }
            //space
            for ( int j = 0; j< 2*i + 2;j++ ){
                System.out.print(" ");
            }
            //star
            for ( int j = 1; j < n-i;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
System.out.println();

        // approach2
        int spaces = 2*n-2;
        for ( int i = 1; i <= 2*n - 1; i++){
            // star
            int stars = i;
            if(i>n) stars = 2*n-i;
            for ( int j = 1; j <= stars ; j++){
                 System.out.print("*");
            }
            //space
            for ( int j = 1 ; j <= spaces ; j++){
                System.out.print(" ");
            }
            // star
            for ( int j = 1; j <= stars ; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) spaces -=2;
            else spaces +=2;
        
        }
    }
}


/* 
 
                output
                
                *        *
                **      **
                ***    ***
                ****  ****
                **********
                ****  ****
                ***    ***
                **      **
                *        *
 */