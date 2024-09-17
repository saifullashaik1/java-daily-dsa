package javabasics;

import java.nio.file.ClosedWatchServiceException;

public class ArrayExample {
    public static void main(String[] args) {
        // Declaring an array of integers
        int[] numbers = new int[5];  // Array size is 5

// Initializing values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;


// Accessing elements
        System.out.println(numbers[0]);  // Outputs 10
        System.out.println(numbers[3]);  // Outputs 40

// Modifying elements
        numbers[2] = 100;  // Changing value at index 2 to 100
        System.out.println(numbers[2]);  // Outputs 10

// ;ength of an array

        System.out.println(numbers.length);  // Outputs 5

// iterating over arrays

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);  // Outputs each element
        }

        // multidimensional array

        // Declaring and initializing a 2D array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

// Accessing elements
        System.out.println(matrix[0][1]);  // Outputs 2 (element at row 0, column 1)
        System.out.println(matrix[2][2]);  // Outputs 9 (element at row 2, column 2)


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        //all important exmples in arrays

        // 1.median of two sorted arrays .
        // Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
        //The overall run time complexity should be O(log (m+n)









    }}
