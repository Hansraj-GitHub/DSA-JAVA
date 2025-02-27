import java.util.*;

public class RemoveDuplicates {
    public static String removeDuplicates(String s) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("zvvo")); // Output: "zvo"
        System.out.println(removeDuplicates("gfg"));  // Output: "gf"
    }
}

