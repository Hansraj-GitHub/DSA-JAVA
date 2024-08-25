public class LinearSearch {
    public static void main(String[] args) {
     
    int[]  nums = { 45,65,34,76,48};
    int target = 76;
    int ans = linear(nums, target);
    System.out.println(ans);

    }

    static int linear(int[] arr , int target ){ 
        if( arr.length == 0){
            return -1;
        }

        for( int i = 0; i < arr.length ; i++){
            int element = arr[i];
            if(element == target){
                return i; 
            }
        }
        return -1;
    }
}
