package zajavka.Homework.fifth;

import java.util.Scanner;

public class Day13Zajavka {
    public static void main(String[] args) {
//        silnia();
//        pali();
//        tree();
//        mazaki();
//        exercise5();
//        exercise6();
//        exercise7();
        exercise8();
    }


    //1. Napisz program liczący silnię
    public static void silnia() {
        Scanner input = new Scanner(System.in);
        int pr;
        int pr2 = 1;
        System.out.println("Podaj liczbę do wyliczenia silni : ");
        pr = input.nextInt();
        for (int i = 1; i <= pr; i++) {
            pr2 *= i;
        }
        System.out.println("wynik " + pr + "! wynosi: " + pr2);
    }

    //2. Napisz program, który określi czy podane słowo jest palindromem.
    //  wyrażenie brzmiące tak samo czytane od lewej do prawej i od prawej do lewej
    public static void pali() {
        String str = "zaraz";
        String noWhite = str.replace(" ", "");
        System.out.println("With white: " + palindrom(str));
        System.out.println("No white: " + palindrom(noWhite));

    }

    public static boolean palindrom(String sentence) {
        for (int i = 0; i < sentence.length() / 2; i++) {
            if (sentence.charAt(i) != sentence.charAt(sentence.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    //3. Napisz program, który na ekranie wydrukuje choinkę z podanych przez Ciebie znaków, przy czym
    //parametrem wejściowym jest ilość znaków w podstawie. Do tego, żeby to wyglądało jak choinka, to
    //w każdym kolejnym rzędzie, idąc z dołu do góry, musi być o 2 znaki mniej niż w rzędzie poprzednim.
    //Do tego załóż, że jak w podstawie jest liczba parzysta, to na samej górze zostają 2 znaki, a jak
    //nieparzysta to jeden.

    private static void tree() {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Wybierz liczbę 1 lub 2 : ");
        a = input.nextInt();
        while (a == 1) {
            switch (a) {
                case 1:
                    System.out.println("    #");
                    System.out.println("   ###");
                    System.out.println("  #####");
                    System.out.println(" #######");
                    System.out.println("#########");
                    return;
            }
        }
        while (a == 2){
            switch (a) {
                case 2:
                    System.out.println("    ##");
                    System.out.println("   ####");
                    System.out.println("  ######");
                    System.out.println(" ########");
                    System.out.println("##########");
                    return;
            }
        }
        while (a > 2) {
            System.out.println("Podano złą liczbę");
            return;
        }
    }
    //4. Rafał ma 6 kolorowych mazaków (czerwony, zielony, niebieski, czarny, żółty i brązowy) i rysuje nimi
    //w podanej kolejności kolorów 100 kresek. Wypisz wszystkie kolory w kolejności odpowiadające
    //rysowanym kreskom i zobacz jaki kolor będzie ostatni.

    private static void mazaki() {
        for (int i = 1; i <= 100; i++) {
            if (i % 6 == 0){
                System.out.println("brown");
            }
            if (i % 6 == 1){
                System.out.println("red");
            }
            if (i % 6 == 2){
                System.out.println("green");
            }
            if (i % 6 == 3){
                System.out.println("blue");
            }
            if (i % 6 == 4){
                System.out.println("black");
            }
            if (i % 6 == 5){
                System.out.println("yellow");
            }

        }
    }
    //5. Napisz program, który wydrukuje wszystkie liczby pierwsze od 2 do 10000.

    private static void exercise5() {
        for (int i = 0; i < 10000; i++) {
            boolean first = true;
            if (i < 2) {
                first = false;
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        first = false;
                        break;
                    }
                }
            }
            if (first) {
                System.out.println("Liczbą pierwszą jest: " + i);
            }
        }
    }
    //6. Napisz program, który na ekranie będzie w stanie wydrukować następujący ciąg znaków
    //39,11,41,8,43,5,45,2,47,-1,49,-4,51,-7,53,-10,55,-13,57,-16. Napisz ten program w taki sposób,
    //aby można było podać długość drukowanego ciągu, np 1000. Zauważ, że na końcu ciągu nie ma
    //przecinka, są tylko w środku
    private static void exercise6() {
        int finalLength = 10;
        int counter = 0;

        for (int i = 39, j = 11; counter < finalLength; counter++) {
            if (counter == finalLength - 1) {
                System.out.println(i + " , " + j);
            } else {
                System.out.println(i + " , " + j + " , ");
            }
            i = i + 2;
            j = j - 3;
        }
    }
    //7. Napisz program drukujący na ekranie ciąg Fibonacciego. Wydrukuj pierwsze 20 znaków ciągu. Znaki
    //ciągu możesz oddzielić spacją.
    private static void exercise7() {
        int x1 = 0;
        int x2 = 1;
        int count = 18;
        System.out.println(x1 + " ");
        System.out.println(x2 + " ");

        for (int i = 0; i < count; i++) {
            int temp = x1 + x2;
            System.out.println(temp + " ");
            x1 = x2;
            x2 = temp;
        }
    }
//8. Napisz program drukujący ciąg znaków jak poniżej. Napisz to tak, żeby liczenie doszło do 999.
//Postaraj się wykorzystać pętle zagnieżdżone, tzn. nie pisz czegoś takiego:
//System.out.println("####"); wielokrotnie pod sobą.

    private static void exercise8() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(i);
            }
            System.out.println();

            for (int k = 0; k < 4; k++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}
