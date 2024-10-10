
public class rearrangeArraysBySign{
    public static void main(String[] args) {
        int[] arr = {-3,1,-2,-5,2,4};

        int[] ans = reArrangeArraysign(arr);
        for ( int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }

    }

    public  static int[] reArrangeArraysign(int[] arr) {

        int positive = 0 ;
        int negative = 1;
        int[] ans = new int[arr.length];

        for ( int i = 0 ; i < arr.length ; i++){
            if (arr[i] >= 0) {
                ans[positive] = arr[i];
                positive += 2;
            } else {
                ans[negative] = arr[i];
                negative += 2;
            }
        }
        return ans;
    }
}