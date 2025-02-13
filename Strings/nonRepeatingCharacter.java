    import java.util.*;

    public class nonRepeatingCharacter {
        public static char firstNonRepeating(String s) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '$'; 
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
       

        System.out.println(firstNonRepeating(s));
        
        
    }
}


