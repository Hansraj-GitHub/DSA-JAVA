import java.util.*;
public class pascalsTringle {
      // Method to calculate nCr (combination)
      public static int nCr(int n, int r) {
        int result = 1;
        // Loop to calculate nCr:
        for (int i = 0; i < r; i++) {
            result = result * (n - i); // Multiply by (n - i)
            result = result / (i + 1); // Divide by (i + 1)
        }
        return result;
    }

    // Method to generate Pascal's Triangle
    public static List<List<Integer>> generatePascalTriangle(int n) {
        List<List<Integer>> triangle = new ArrayList<>(); // To store the entire triangle

        // Loop through each row
        for (int row = 0; row < n; row++) {
            List<Integer> currentRow = new ArrayList<>(); // Temporary list for the current row

            // Loop through each column in the row
            for (int col = 0; col <= row; col++) {
                currentRow.add(nCr(row, col)); // Add the combination value
            }

            // Add the current row to the triangle
            triangle.add(currentRow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int n = 5; // Number of rows in Pascal's Triangle

        // Generate Pascal's Triangle
        List<List<Integer>> triangle = generatePascalTriangle(n);

        // Print Pascal's Triangle
        for (int row = 0; row < triangle.size(); row++) {
            for (int col = 0; col < triangle.get(row).size(); col++) {
                System.out.print(triangle.get(row).get(col) + " "); // Print each number
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}