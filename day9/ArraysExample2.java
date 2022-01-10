package zajavka.day9;

public class ArraysExample2 {
    public static void main(String[] args) {
        ArraysExample2 arraysExamplee = new ArraysExample2();
        arraysExamplee.arraysExample2();

    }

    private void arraysExample2() {
        double[] array = new double[]{1.0, 2.5, 3.72, 3.0, 9.34, 1.29, 2.55, 1.23894};

        //total
        double total = 0;
        for (double element : array) { // foreach loop
            total += element;
        }
        System.out.println("Total: " + total);

        //max
        double maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        System.out.println("Maximum: " + maximum);
    }
}
