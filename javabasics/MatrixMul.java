package javabasics;

public class MatrixMul {
    public static int[] multiplyMatrices(int[][] A, int[][] B){
        int rowsA = A.length ;
        int colsA =A[0].length;
        int colsB =B[0].length;

        int[][] result = new int[rowsA][colsB] ;

        for (int i = 0;i<rowsA ; i++){
            for(int j =0; j<colsB ; j++){
                result[i][j] = 0 ;

                for (int k = 0; k=colsA;k++){
                    result[i][j] += A[i][k] * B[j][k] ;
                }

            }
        }
        return result;

    }
    public static void matrix(int[][] matrix){
        for (int[] row : matrix){
            for(int val : row){
                System.out.println(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int[][] result = multiplyMatrices(A,B);
        System.out.println("matrix A * matrix B");
        matrix(result);
    }
}
