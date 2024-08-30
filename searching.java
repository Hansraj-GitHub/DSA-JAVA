public class searching {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {8,5,6,16,18};
        int k = 16;

        for ( int i =  0; i < n; i++) {
            if ( arr[i] == k) {
                System.out.println(i);
            }
        }
    }
}
