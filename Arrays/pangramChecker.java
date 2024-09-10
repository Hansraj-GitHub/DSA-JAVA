public class pangramChecker {

    public boolean isPangram(String sentence) {
        // Boolean array to track the appearance of each letter (26 letters in the alphabet)
        boolean[] lettersPresent = new boolean[26];
        int totalLetters = 0; // To count how many unique letters we've found
        
        // Iterate through each character in the sentence using a for loop
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);  // Get the character at the current index
            
            // Convert the character to an index (0 for 'a', 1 for 'b', ..., 25 for 'z')
            int index = c - 'a';
            
            // If the letter at this index hasn't been marked yet, mark it as true
            if (!lettersPresent[index]) {
                lettersPresent[index] = true;
                totalLetters++;
            }
            
            // If all 26 letters are found, it's a pangram
            if (totalLetters == 26) {
                return true;
            }
        }
        
        // Return true if all letters are present, otherwise false
        return totalLetters == 26;
    }

    public static void main(String[] args) {
        pangramChecker checker = new pangramChecker();
        
        // Test case 1
        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checker.isPangram(sentence1)); // Output: true
    }
}
