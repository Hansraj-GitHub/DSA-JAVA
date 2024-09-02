public class lengthOfLastWord {
    public static void main(String[] args) {
        String s = "hello and welcome";
        
        // Trim any trailing spaces (though this example does not have trailing spaces)
        s = s.trim();
        
        // Find the last space in the string
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // Calculate the length of the last word
        int lengthOfLastWord = s.length() - lastSpaceIndex - 1;
        
        // Print the result
        System.out.println("Length of the last word: " + lengthOfLastWord);


    }
}