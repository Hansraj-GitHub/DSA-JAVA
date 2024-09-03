public class IntegerToRoman {
    public String intToRoman(int num) {
        // Array of integer values and their corresponding Roman numeral symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        
        // Loop through the values and symbols arrays
        for (int i = 0; i < values.length; i++) {
            // While the current value can be subtracted from num, append the symbol
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }
        
        // Convert the StringBuilder to a String and return it
        return result.toString();
    }

    public static void main(String[] args) {
        IntegerToRoman converter = new IntegerToRoman();
        
        // Example 1: Input 3749, Output "MMMDCCXLIX"
        System.out.println(converter.intToRoman(3749));
        
        // Example 2: Input 58, Output "LVIII"
        System.out.println(converter.intToRoman(58));
        
        // Example 3: Input 1994, Output "MCMXCIV"
        System.out.println(converter.intToRoman(1994));
    }
}
