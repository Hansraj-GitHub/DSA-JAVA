import java.util.ArrayList;

public class mergeSort{
    public static void main(String[] args) {
        int[] arr = {5,3,8,4,6};
        int n = arr.length;
        System.out.print("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergesort(arr, 0, n - 1);
        System.out.print("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    
    private static void mergesort(int[] arr, int low, int high) {
        if (low >= high){
            return;
        }
        int mid = (low + high ) / 2;
        mergesort(arr , low , mid);
        mergesort(arr, mid+1, high);
        mSort(arr,low,mid,high);
    }

    private static void mSort(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;
        int right = mid+1;
        while (left <= mid && right <= high){
            if (arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;

            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        for ( int i = low ; i <= high ; i++){
            arr[i] = temp.get(i - low);

        }
    }
}