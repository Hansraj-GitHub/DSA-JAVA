
import java.util.ArrayList;
import java.util.Collections;

public class arrayLeaders{
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2}; // output = {17 5 2}
        int n = 6 ;
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n - 1]; // Start with the last element
        ans.add(max); // The last element is always a leader
        
        // Traverse the array from second last element to the first
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) { // If the current element is greater than or equal to max
                ans.add(arr[i]);  // Add it to the list of leaders
                max = arr[i];     // Update max
            }
        }

        // Reverse the list to get leaders in correct order (left to right)
        Collections.reverse(ans);
        System.out.println(ans);
    }
}