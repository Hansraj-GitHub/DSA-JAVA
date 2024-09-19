
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,5,6,7,9,15};
        int target = 9;

        int index = -1;
        for ( int i = 0; i < arr.length ; i++){
            if ( arr[i] == target){
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
