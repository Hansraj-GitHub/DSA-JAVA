public class reverseString {
    public static void main(String[] args) {
        // Initialize the character array
        char[] s = {'H', 'e', 'l', 'l', 'o'};
        
        // Reverse the array
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap the elements
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move pointers
            left++;
            right--;
        }
        
        // Print the reversed array
        System.out.print("Reversed array: ");
        for (char ch : s) {
            System.out.print(ch + " ");
        }
    }
}
