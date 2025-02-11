public class multiplyTwoString {
    public static String multiplyStrings(String s1, String s2) {
        // Handle sign and remove leading zeros
        boolean isNegative = (s1.charAt(0) == '-') ^ (s2.charAt(0) == '-'); // XOR to check if only one is negative
        s1 = removeLeadingZeros(s1.replace("-", ""));
        s2 = removeLeadingZeros(s2.replace("-", ""));
        
        if (s1.equals("0") || s2.equals("0")) return "0"; // Edge case

        int m = s1.length(), n = s2.length();
        int[] result = new int[m + n]; // Array to store product digits
        
        // Perform multiplication
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
                int sum = mul + result[i + j + 1]; // Add to previous value
                
                result[i + j + 1] = sum % 10; // Store unit place
                result[i + j] += sum / 10; // Carry to next place
            }
        }

        // Convert result array to string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // Skip leading zeros
                sb.append(num);
            }
        }

        return (isNegative ? "-" : "") + sb.toString();
    }

    // Removes leading zeros from a string, ensuring "0" remains "0"
    private static String removeLeadingZeros(String s) {
        int i = 0;
        while (i < s.length() - 1 && s.charAt(i) == '0') {
            i++;
        }
        return s.substring(i);
    }

    public static void main(String[] args) {
        System.out.println(multiplyStrings("0033", "2")); // Output: "66"
    }
}
