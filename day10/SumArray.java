package zajavka.day10;

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 8, 2},
                {2, 5, 1},
                {3, 9 ,7}
        };

        printSum(matrix);
        printLargestNumber(matrix);
    }
    private static void printSum(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }
            System.out.println("Array: " + Arrays.toString(matrix[row]) + " sum: " + sum);
        }
    }
    private static void printLargestNumber(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
        int largest = matrix[row][0];
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] > largest){
                    largest = matrix[row][column];
                }
            }
            System.out.println("Largest element: " + Arrays.toString(matrix[row]) + " el: " + largest);
        }
    }
}
