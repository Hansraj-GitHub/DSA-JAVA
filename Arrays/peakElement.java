class peakElement {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
                (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return mid;
            }

            // If the left neighbor is greater, move to the left half
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            } else { // Else move to the right half
                left = mid + 1;
            }
        }
        return -1; // This case will never be reached due to the problem constraints
    }

    public static boolean isValidPeak(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return false;
        }
        boolean leftCheck = (index == 0 || arr[index] > arr[index - 1]);
        boolean rightCheck = (index == arr.length - 1 || arr[index] > arr[index + 1]);
        return leftCheck && rightCheck;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        int index = findPeakElement(arr);
        System.out.println(isValidPeak(arr, index)); // Output: true

    }
}

