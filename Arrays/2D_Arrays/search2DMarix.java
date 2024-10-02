public class search2DMarix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9,7},
            {19, 90,16}
        };

        int target = 16; 
        boolean found = searchMatrix(arr, target);

        
        System.out.println(found);
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
            for ( int i = 0 ; i < matrix.length ; i++){
                for( int j = 0 ; j < matrix[i].length ; j++){
                    if (matrix[i][j] == target){
                        return true;
                    }
                }
            }
            return false;
    }
    
    
}