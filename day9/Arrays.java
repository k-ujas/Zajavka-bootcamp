package zajavka.day9;

public class Arrays {
    public static void main(String[] args) {

        int[] array1; // more preferable
        int array2[]; // also possible but to preferable

        array1 = new int[10];
        int[] array3 = new int[]{1, 2, 13, 27};
        int[] array4 = {1, 2, 3, 4};
        System.out.println(array3); // bad result (hasdcode)
        System.out.println(java.util.Arrays.toString(array3)); // now it's ok
        System.out.println(array3[2]);
        System.out.println(array3[3]);

        array3[1] = 56473; // update value of array3 index 1
        System.out.println(java.util.Arrays.toString(array3));
    }
}
