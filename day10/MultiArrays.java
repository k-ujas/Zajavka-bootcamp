package zajavka.day10;

import java.util.Arrays;

public class MultiArrays {
    public static void main(String[] args) {
        String[][] array = {
                {"g1e1", "g1e2"},
                {"g2e1", "g2e2", "g2e3"},
                {"g3e1", "g3e2", "g3e3", "g3e4"},
                {"g4e1", "g4e2"}
        };
//        printArray(array);
//        printArray2(array);
//        System.out.println(generateRandomValue());
        int[][] matrix = createMatrix(6,5);
        printArray3(matrix);

        System.out.println("access [2][1]:" + Arrays.toString(array[2]));
        System.out.println(Arrays.toString(array[0]));
        System.out.println(array[2][1]);
        array[2][1] = "new";
        System.out.println(array[2][1]);
        System.out.println();


        int[][] array2 = new int[4][];
        array2[0] = new int[5];
        array2[1] = new int[3];
        array2[2] = new int[2];
        array2[3] = new int[8];
        System.out.println(Arrays.toString(array2[0]));
        System.out.println(Arrays.toString(array2[1]));
        System.out.println(Arrays.toString(array2[2]));
        System.out.println(Arrays.toString(array2[3]));

    }

    private static void printArray(int[][] toPrint) {
        for (int row = 0; row < toPrint.length; row++) {
            for (int column = 0; column < toPrint[row].length; column++) {
                System.out.println("accessing: [" + row + "][" + column + "]: " + toPrint[row][column]);
            }
//            System.out.println("Array: " + Arrays.toString(array[row]));
        }
    }

    private static void printArray2(String[][] toPrint) {
        for (String[] internArray : toPrint) {
            for (String element : internArray) {
                System.out.println(element);
            }
//            System.out.println("Array: " + Arrays.toString(array[row]));
        }
    }
    private static void printArray3(int[][] toPrint) {
        for (int[] internArray : toPrint) {
                System.out.println(Arrays.toString(internArray));
            }
        }

    private static int generateRandomValue() {
        int min = 1;
        int max = 42;
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
    private static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = generateRandomValue();
            }
        }
        return matrix;
    }
}
