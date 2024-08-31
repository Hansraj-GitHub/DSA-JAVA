public class secondLargest {
    public static void main(String[] args) {
        int arr[] = { 10,7,15,9,25,80,70,777,526,190};
        int largest = arr[0];
        int secondLargest= -1;
        for(int i = 0; i < arr.length; i++) {
            if ( arr[i] > largest ) {
                secondLargest=largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest ) {
                secondLargest=arr[i];
            }
        }  
        System.out.println("secondLargest no is: "+ secondLargest);
    }
}
