class pattern13{
    public static void main(String[] args) {
        int n = 5;
        int temp = 1;
        for ( int i = 0; i < n ; i++){
            for ( int j = 0 ; j <= i; j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
}

        // OUTPUT

        /* 

            1 
            2 3 
            4 5 6 
            7 8 9 10 
            11 12 13 14 15 


         */