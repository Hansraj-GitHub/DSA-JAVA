public class majorityElements{
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int n = arr.length;
        int count = 0;

        for ( int i = 0; i < arr.length ; i++){
            for( int j = 1; j < n; j++){
                if ( arr[i] == arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}