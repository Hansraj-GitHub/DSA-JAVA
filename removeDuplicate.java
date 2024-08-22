public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,};
        int count = 0;
        for( int i = 0 ; i < arr.length; i++) {
            if(  i < arr.length -1 && arr[i] == arr[i+1]) {
                continue;
            } else {
                arr[count] = arr[i];
                count++;
            }
        }
            System.out.print(count);
         
    }
}
