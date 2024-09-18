public class MatrixAddition {
    public static int[][] addMatrices(int[][] a, int[][] b){
        int rows = a.length ;
        int columns = a[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows ;i++){
            for(int j=0;j< columns ; j++){
                result[i][j] = a[i][j] + b[i][j] ;

            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for (int val : row){
                System.out.print(val + " ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] b = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int[][] result = addMatrices(a, b);

        System.out.println("Matrix a + Matrix b:");
        printMatrix(result);  // Output the
    }
}