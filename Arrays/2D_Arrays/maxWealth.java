
public class maxWealth{
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,5},
            {5,2,2},
            {8,2,1}
        };
        System.out.println(maxWealth(arr));
    }
    static int maxWealth(int[][] accounts){
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for ( int person = 0; person < accounts.length ; person++){
            int sum = 0;
            for( int account = 0; account < accounts[person].length ; account++){
                sum = sum + accounts[person][account];
            } 
            // now we have sum of accounts of person 
            // check with overall ans 
            if ( sum > ans ){
                ans = sum;
            }
        }
        return ans; 
    }
}