public class quickSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        quicksort(arr);
        
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int j = high;

        for (int i = low + 1; i <= j;) {
            if (arr[i] <= pivot) {
                i++;
            } else {
                // Swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        // Place the pivot in the correct position
        arr[low] = arr[j];
        arr[j] = pivot;
        return j; // Return the pivot index
    }

    private static void quicksort(int[] arr) {
        qs(arr, 0, arr.length - 1);
    }
}
