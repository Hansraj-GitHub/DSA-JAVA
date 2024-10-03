public class lengthOfLastWord {
    public static void main(String[] args) {
        String s = "hello and welcome";
        
        s = s.trim();
        
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        int lengthOfLastWord = s.length() - lastSpaceIndex - 1;
        
        System.out.println("Length of the last word: " + lengthOfLastWord);


    }
}