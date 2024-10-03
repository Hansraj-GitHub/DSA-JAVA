import java.util.ArrayList;

public class unionTwoSortedArray{
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {1,2,3,4,5,1};
        int m = 6;
        int[] arr2 = {1,2,3,4,5,6};

        ArrayList<Integer> numbers = new ArrayList<>();

        int i = 0 ; int j = 0;

        while (i < n && j < m){
            if ( arr1[i] < arr2[j]){
                numbers.add(arr1[i]);
                i++;
            }else if (arr1[i] > arr2[j]){
                numbers.add(arr2[j]);
                j++;
            }else{
                numbers.add(arr1[i]);
                i++;
                j++;
            }
                
        }

        while (i < n ){
            numbers.add(arr1[i]);
            i++;
        }

        while(j < m ){
            numbers.add(arr2[j]);
            j++;

        }

        System.out.println("union sorted" + numbers);
        
    }
}