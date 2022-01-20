// Tablice - zadania

package zajavka.Homework.sixth;

import java.util.Arrays;

public class Day15Zajavka {
    public static void main(String[] args) {
//        exercise1();
//exercise2();
//exercise3();
//        exercise4();
//        exercise5();
//        exercise6();
//        exercise7();
        exercise8();
    }


    // 1. Napisz program, który odwróci zawartość Stringa tyłem do przodu.

    public static void exercise1() {
        String someInputString = "someInputString";
        char[] charArr = someInputString.toCharArray();

        System.out.println("someInputString = " + reverse(someInputString));
        System.out.println("charArr = " + reverse(charArr));
    }
    private static String reverse(String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }

    private static String reverse(char[] input) {
        String result = "";
        for (int i = input.length - 1; i >= 0; i--) {
            result += input[i];
        }
        return result;
    }

    // 2. Napisz program, który sprawdzi, czy podany ciąg znaków jest palindromem. Tym razem wykorzystaj
    //tablice.

    private static void exercise2() {
        String str = "zaraza zaraz";
        String noWhite = str.replace(" ", "");//usuniecie spacji w zdaniu
        String reversed = reverse(str);
        String noWhiteReversed = reverse(noWhite);

        System.out.println("With white: " + reversed + ", equals?: " + str.equals(reversed));
        System.out.println("No white: " + noWhiteReversed + ", equals?: " + noWhite.equals(noWhiteReversed));

    }
    // 3. Napisz program, który odwróci kolejność elementów w tablicy.

    private static void exercise3() {
        String[] arr = {"Rzeszów", "Bydgoszcz", "Wrocław", "Kraków"};
        String[] reversed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - i - 1] = arr[i];
        }
        System.out.println("Original: " + Arrays.asList(arr));
        System.out.println("Reversed: " + Arrays.asList(reversed));
    }
    //4. Napisz program, który znajdzie w tablicy zduplikowane elementy i stworzy z nich tablicę. Kolejność
    //nie ma znaczenia.

    private static void exercise4() {
        int[] arr = {-3, 5, 3, 9, 3, 6, 9, 3, -3, 5};
        System.out.println("Original: " + Arrays.toString(arr));

        int[] duplicatesArr = new int[arr.length / 2];
        int duplicateIndex = 0;
        for (final int element : arr) {
            if (
                    elementDuplicatedIn(arr, element)
                            && !elementPresentIn(duplicatesArr, element, duplicateIndex)
            ) {
                duplicatesArr[duplicateIndex] = element;
                duplicateIndex++;
            }
        }
        int[] duplicatesArrResized = new int[duplicateIndex];
        assignArray(duplicatesArrResized, duplicatesArr);
        System.out.println("Duplicates: " + Arrays.toString(duplicatesArr));
        System.out.println("Duplicates resized: " + Arrays.toString(duplicatesArrResized));
    }
    private static boolean elementDuplicatedIn(
            final int[] arr,
            final int elementToCheck
    ) {
        int counter = 0;
        for (int element : arr) {
            counter = element == elementToCheck ? counter + 1 : counter;
            if (counter >= 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean elementPresentIn(
            final int[] duplicatesArr,
            final int elementToCheck,
            final int duplicateIndex
    ) {
        int index = 0;
        for (int element : duplicatesArr) {
            if (index == duplicateIndex) {
                break;
            }
            if (element == elementToCheck) {
                return true;
            }
            index++;
        }
        return false;
    }

    private static void assignArray(final int[] duplicatesArrResized, final int[] duplicatesArr) {
        for (int i = 0; i < duplicatesArrResized.length; i++) {
            duplicatesArrResized[i] = duplicatesArr[i];
        }
    }

    //5. Napisz program, który porówna ze sobą zawartość dwóch tablic i wydrukuje na ekranie, czy
    //zawartość jest taka sama. Kolejność wejściowa elementów nie ma znaczenia. Liczy się tylko
    //zawartość, np. [2, 6, 1, 12] == [12, 6, 1, 2] ale [2, 6, 1, 12] != [12, 6, 1, 3].

    private static void exercise5() {
        int[] arr1 = {-1, 2, 5, 19, -2, -1, 3, -5, 4, 2, -19, 19, -3, 3, 5, -5, 4, 19, -1, -2, 3, -5};
        int[] arr2 = {4, 2, -19, 19, -3, 3, 5, -5, 4, 19, -1, -2, 3, -5, -1, 2, 5, 19, -2, -1, 3, -5};

        sort(arr1);
        sort(arr2);

        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println("Equal? " + equals);

        boolean customEquals = areArraysequals(arr1, arr2);
        System.out.println("Custom equal? " + customEquals);
    }
    private static boolean areArraysequals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {

            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    //6. Zamień wszystkie słowa w tablicy tak aby były one w całości napisane z wielkiej litery, natomiast
    //reszta literek była już małą literą. Postaraj się nie tworzyć żadnych nowych tablic oprócz tej, która
    //zawiera dane wejściowe.

    private static void exercise6() {
        String[] arr = {"RzeszóW", "BydgoszCZ", "WrocłaW", "KrAKów"};

        for (int i = 0; i < arr.length; i++) {
            String newWord = arr[i].toLowerCase();
            newWord = newWord.replaceFirst(
                    String.valueOf(newWord.charAt(0)),
                    String.valueOf(newWord.charAt(0)).toUpperCase());
            arr[i] = newWord;
        }
        System.out.println(Arrays.toString(arr));
    }
    //7. Napisz program, który znajdzie druga największą wartość w tablicy
    private static void exercise7() {
        int[] arr1 = {-1, 2, 5, 0, -2, -1, 3, -5, 4, 2, -19, 17, -3, 3, 5, -5, 4, 18, 0, -1, -2, 3, -5, 0};
        int[] deduplicated1 = deduplicateAndSort(arr1);
        System.out.println("Second largest: " + deduplicated1[deduplicated1.length - 2]);

        int[] arr2 = {-1, -22, -5, -19, 0, -5, -2, -19, -17, -3, -3, -5, -5, -4, -18, 0, -1, -2, -3, -5, 0};
        int[] deduplicated2 = deduplicateAndSort(arr2);
        System.out.println("Second largest: " + deduplicated2[deduplicated2.length - 2]);
    }

    private static int[] deduplicateAndSort(int[] arr) {
        sort(arr);
        int sizeOfNonDuplicates = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                sizeOfNonDuplicates++;
            }
        }
        int length = arr.length;
        int[] temp = new int[sizeOfNonDuplicates];
        int j = 0;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j] = arr[length - 1];
        return temp;
    }

    private static void sort(final int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    //8. Napisz program, który w tablicy znajdzie pary których suma wynosi podaną przez Ciebie wartość.

    private static void exercise8() {
        int[] arr = {-1, 2, 5, 19, -2, -1, 3, -5, 4, 2, -19, 17, -3, 3, 5, 10, -5, 4, 18, -1, -2, 3, -5};
        findPairs((arr), 14);
        findPairs((arr), 16);
        findPairs((arr), 4);
    }
    private static void findPairs(final int[] arr, int equalTo) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i == j) {
                    break;
                }
                if (arr[i] + arr[j] == equalTo) {
                    System.out.println("Pair equal to " + equalTo + ": " + arr[i] + " and " + arr[j]);
                }
            }
        }
    }
}

