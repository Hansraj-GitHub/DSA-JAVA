public class setMatrixZeroes {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        int n = arr.length;
        int m = arr[0].length;
        
        int[][] ans = zeroMatrix(arr, n, m);

        // Print the final matrix
        System.out.println("The Final matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] zeroMatrix(int[][] arr, int n, int m) {
        // Arrays to mark rows and columns with zeros
        int[] row = new int[n];
        int[] col = new int[m];

        // Mark the rows and columns that need to be zeroed
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Set the matrix elements to zero where row or column is marked
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }

        // Return the modified matrix
        return arr;
    }
}
