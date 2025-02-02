public class reverseWord {
    
        public static String reverseWords(String s) {
            // Step 1: Trim leading and trailing spaces
            s = s.trim();
            
            // Step 2: Split words by spaces (handle multiple spaces)
            String[] words = s.split("\\s+");
    
            // Step 3: Reverse the words
            StringBuilder reversed = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]);
                if (i > 0) {
                    reversed.append(" ");
                }
            }
    
            // Step 4: Return the reversed sentence
            return reversed.toString();
        }
    
        public static void main(String[] args) {
            System.out.println(reverseWords(" Good Morning")); // Output: "much very program this like i"
        }
    
}
