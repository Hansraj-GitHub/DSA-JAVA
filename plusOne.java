public class plusOne {
    public static void main(String[] args) {
        
}


    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse from the least significant digit to the most significant
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // If the current digit is less than 9, just increment and return
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0 and continue with carry
            digits[i] = 0;
        }
        
        // If we are here, it means all digits were 9, so we need a new array
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // The most significant digit is 1, all others are 0 by default
        return newNumber;
    }
}

