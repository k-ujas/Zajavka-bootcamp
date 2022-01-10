package zajavka.day9;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        ArraysExample arraysExample = new ArraysExample();
        arraysExample.arraysExample1();

    }
    private void arraysExample1() {
        String[] array = new String[10];

        int i = 0;
        while (i < 5) {
            array[i] = "Hello new index: " + i;
            i++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("size of array: " + array.length);
        String completeContent = "";
        for (int k = 0; k < 7; k++) {
            completeContent = completeContent + array[k] + ";";
            System.out.println("Print => " + array[k]);
        }
        System.out.println(completeContent);
    }
}
