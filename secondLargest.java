public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 16, 12, 6, 9};
        
        if (arr.length < 2) {
            System.out.println("Array doesn't have enough elements to find the second largest.");
            return;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; 
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
