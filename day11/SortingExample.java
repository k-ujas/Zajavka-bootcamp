package zajavka.day11;

import java.util.Arrays;

public class SortingExample {
    public static void main(String[] args) {
        int[] arr = {5, 34, 78, 11, 35, 65, 98, 1, 5, 3, 66, 21};
        System.out.println("Before: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After: " + Arrays.toString(arr));

        int result = Arrays.binarySearch(arr, 98); //tablica musi byc posortowana, jak nie ma szukanej liczby w tablicy, to pokazuje na którym miejscu powinno być z minusem odjac jeden
        System.out.println(result);
    }
}
