public class sumEO {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,4,5};

        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                odd = odd + arr[i];

            } else {
                even = even + arr[i];
            }

        }
        System.out.println(odd);
        System.out.print(even);

    }

}
