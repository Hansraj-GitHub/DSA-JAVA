public class shuffleArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8};
        int n = 3;
        int[] result = shuffle(arr, n);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] shuffle(int[] arr , int n){
        
        int[] result = new int[2*n];
        for ( int i = 0 ; i < n ; i++){
            result[2*i] = arr[i];
            result[2*i+1] = arr[i+n];
        }
        return result;
    }
}