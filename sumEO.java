public class sumEO {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = {1,2,3,4,5,6,7};

        int even = 0;
        int odd = 0;    

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even = even + arr[i];

            } else {
                odd = odd + arr[i];
            }

        }
        System.out.println(odd);
        System.out.print(even);

    }

}
