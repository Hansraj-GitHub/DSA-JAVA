public class pairSum {
    public static boolean PairWithSum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return true; 
                }
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 16;
        System.out.println(PairWithSum(arr, target)); 

    }
}

