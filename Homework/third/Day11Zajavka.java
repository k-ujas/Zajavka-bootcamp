// Operatory - zadania

package zajavka.Homework.third;

public class Day11Zajavka {
    public static void main(String[] args) {
        // 1. Napisz metodę, która przyjmuje 2 liczby double, wydrukuje ich sumę, różnicę, iloczyn oraz iloraz.

//        methodDouble();
//        methodEx2();
//        methodEx4();
        methodEx5();
    }
    public static void methodDouble(){
        double a = 2.0;
        double b = 1.7;
        System.out.println("a + b: " + (a + b));
        System.out.println("a - b: " + (a - b));
        System.out.println("a * b: " + (a * b));
        System.out.println("a : b: " + (a / b));
    }
    //2. Napisz program w którym użyjesz operatorów ==, !, !=, ++, -=, *=. Na początku masz zadeklarowaną
    //zmienną int x = 0. Podczas pisania programu nie możesz zadeklarować żadnej innej zmiennej, tzn.
    //przez cały czas pisania programu możesz operować tylko na tej jednej zmiennej.

    public static void methodEx2(){
        int x = 0;
        System.out.println("\nx == x: " + (x == 5));
        System.out.println("!x == 5: " + (!(x == 5)));
        System.out.println("x != 5: " + (x != 5));
        System.out.println("x++: " + x++);
        System.out.println("x -= 5: " + (x -= 5));
        System.out.println("x *= 5: " + (x *= 5));
    }
    //3. Napisz program, w którym zaczynając od zmiennej byte x = 0, będzie można otrzymać int, long,
    //float oraz double stosując promocję numeryczną
    public static void methodEx3() {
        byte x = 0;
        int a = x + 578;
        long b = a + 4387458345344364343L;
        float c = x + 1.0f;
        double d = x + 5.23;
    }
    //4. Rafał ma 6 kolorowych mazaków (czerwony, zielony, niebieski, czarny, żółty i brązowy) i rysuje nimi
    //w podanej kolejności kolorów 100 kresek. Jaki kolor będzie miała ostatnia kreska? Napisz program,
    //który to policzy.
    public static void methodEx4(){
        int red = 1;
        int green = 2;
        int blue = 3;
        int black = 4;
        int yellow = 5;
        int brown = 6;

        int result = (100 % 6);
        System.out.println(result);
    }
    //5. Napisz metodę, która jako argument przyjmuje liczbę i wydrukuje informację czy metoda jest
    //podzielna przed 3, przez 7 oraz przez 3 i 7 jednocześnie.
    public static void methodEx5() {
        checking(1);
        checking(3);
        checking(7);
        checking(21);
        checking(42);
        checking(43);
    }
    public static void checking(int number) {
        boolean division3 = number % 3 == 0;
        boolean division7 = number % 7 == 0;
        boolean divisionBoth = division3 && division7;

        System.out.println("Liczba " + number + " jest podzielna przez 3?: " + division3);
        System.out.println("Liczba " + number + " jest podzielna przez 7?: " + division7);
        System.out.println("Liczba " + number + " jest podzielna przez 3 i 7?: " + divisionBoth);
    }
}
