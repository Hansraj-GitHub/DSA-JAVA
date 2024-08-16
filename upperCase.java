public class upperCase {
    public static void main(String[] args) {
        String inputString = "hello world! welcome to java.";
        String resultString = capitalizeFirstLetters(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Capitalized String: " + resultString);
    }

    public static String capitalizeFirstLetters(String str) {
        String[] words = str.split("\\s+"); // Split by spaces
        StringBuilder capitalizedString = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize the first letter and append the rest of the word
                capitalizedString.append(Character.toUpperCase(word.charAt(0)));
                capitalizedString.append(word.substring(1)).append(" ");
            }
        }

        // Remove the trailing  space  
        return capitalizedString.toString().trim();

    }
}
