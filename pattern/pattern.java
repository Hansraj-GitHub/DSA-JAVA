public class pattern {
    public static void main(String[] args) {
        int n = 5;
        for ( int i = 0; i < n ; i++){
            // space
            for( int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            //  star
            for(int  j = 0 ; j < 2 * i +1 ; j++){
                System.out.print("*");
            }
            // space
            for( int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        } 
 

 /*
  
output is           *
                   ***
                  *****
                 ********
                **********
 */

 for ( int i = 0; i < n ; i++){
    // space
    for( int j = 0; j < i; j++){
        System.out.print(" ");
    }
    //  star
    for(int  j = 0 ; j < 2*n -(2*i+1) ; j++){
        System.out.print("*");
    }   
    // space
    for( int j = 0; j < i; j++){
        System.out.print(" ");
    }
    System.out.println();
} 

/*
  output is       

*********
 ******* 
  *****  
   ***   
    *  
 */
    for ( int i = 0; i < n ; i++){
    // space
        for( int j = 0; j < n-i-1; j++){
        System.out.print(" ");
        }
        //  star
        for(int  j = 0 ; j < 2 * i +1 ; j++){
            System.out.print("*");
        }
        // space
        for( int j = 0; j < n-i-1; j++){
            System.out.print(" ");
        }
        System.out.println();
    } 
    for ( int i = 0; i < n ; i++){
        // space
        for( int j = 0; j < i; j++){
            System.out.print(" ");
        }
        //  star
        for(int  j = 0 ; j < 2*n -(2*i+1) ; j++){
            System.out.print("*");
        }   
        // space
        for( int j = 0; j < i; j++){
            System.out.print(" ");
        }
        System.out.println();
    } 

   /*  output is 

    *    
   ***   
  *****  
 ******* 
*********
*********
 ******* 
  *****  
   ***   
    *   
    */  



        for ( int i = 0 ; i <= 2*n -1 ; i++){
            int star = i;
            if( i > n   )
            {
                star = 2*n - i;
            }
            for(int j = 1 ; j <= star ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

         /*   
          
*
**
***
****
*****
****
***
**
*

           */

        int start = 1;
        for( int i = 0 ; i < n ; i++){
            if ( i %2 == 0){
                start = 1;
            }else {
                start = 0;  
            }

            for(int j = 0; j<= i; j++){
                System.out.print(start);
                start = 1 - start; 
            }
            System.out.println();
        }
        System.out.println();

        int space =  2 * ( n - 1);
        for(int i=1; i<= n ; i++){
            for ( int j =1; j <= i ; j++){
                System.out.print(j);
            }
            for ( int j =1; j<= space ; j++){
                System.out.print(" ");
            }
            for ( int j = i; j>= 1 ; j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }

        // output
        /* 

        1        1        
        12      21
        123    321
        1234  4321
        1234554321

         */

    }
}