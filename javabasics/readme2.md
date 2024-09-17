# day 2
# Array:

* In Java, an array is a collection of elements of the same data type, stored in a contiguous memory location.
* Arrays are useful for storing multiple values in a single variable and can be used with both primitive data types (e.g., int, char, float) and reference types (e.g., String, objects).
* Declaring and Initializing Arrays:
  1.Declaration: An array must first be declared, specifying its data type.
  2.Instantiation: The array is then instantiated using the new keyword.
  3.Initialization: Finally, the array can be initialized with values.

## Multidimensional Arrays :
* Java allows the creation of arrays with more than one dimension, such as 2D arrays (arrays of arrays).

## Limitations of Arrays:
* Fixed Size: The size of an array is fixed at the time of creation, so you cannot resize it dynamically.
* Homogeneous Data: Arrays can only store elements of the same type.
* Limited Built-in Functions: Compared to collections (like ArrayList), arrays have fewer utility methods.

## 2D Arrays in Java
* A 2D array, or matrix, in Java is essentially an array of arrays. Each element of a 2D array can be accessed using two indices: one for the row and one for the column.

* int[][] matrix = new int[3][3];  // 3x3 matrix(initializatin of matirx array).

## 2D Array Operations: Matrix Addition and Matrix Multiplication

* 1. Matrix Addition:
* Matrix addition is only possible if the two matrices have the same dimensions. For two matrices A and B of size m x n, the sum C = A + B is also a matrix of size m x n, where each element C[i][j] = A[i][j] + B[i][j].

* 2. Matrix Multiplication:
* Matrix multiplication is possible when the number of columns of the first matrix (A) is equal to the number of rows of the second matrix (B).
* For matrices A of size m x n and B of size n x p, the product C = A * B is a matrix of size m x p, where each element C[i][j] = sum(A[i][k] * B[k][j]) for all k.