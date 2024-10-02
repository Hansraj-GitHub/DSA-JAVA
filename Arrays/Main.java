public class Main {
    public static boolean checkSortedAndRotated(int[] nums) {
        int n = nums.length;
        int dropCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                dropCount++;
            }
        }

        return dropCount <= 1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(checkSortedAndRotated(arr)); // Output: true

    }
}
