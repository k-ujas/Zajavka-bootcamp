//Zmienne - zadania

package zajavka.Homework.second;

public class Day9Zajavka {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();

    }

    //1. Napisz program, który dla podanego Stringa przypisze wartość jego długości do zmiennej, następnie
    //wyświetli jego długość na ekranie.

    private static void exercise1() {
        String arg1 = "I am doing exercise number one";
        int size = arg1.length();
        System.out.println(size);
        System.out.println("----------------------------");
    }

    //2. Napisz program, który sklei ze sobą 5 dowolnych Stringów na 2 pokazane różne sposoby i wydrukuje
    //rezultat na ekranie.

    private static void exercise2() {
        String country1 = "Poland ";
        String country2 = "Germany ";
        String country3 = "Japan ";
        String country4 = "France ";

        String addCountry = country1 + country2 + country3 + country4;
        String addByConcat = country1.concat(country2).concat(country3).concat(country4);

        System.out.println("addCountry:" + addCountry);
        System.out.println("addByConcat:" + addByConcat);
        System.out.println("----------------------------");
    }

    //3. Napisz program, który zamieni samogłoski w podanym zdaniu na podaną przez Ciebie liczbę
    //zmiennoprzecinkową.

    private static void exercise3() {
        String a = "a";
        String a2 = "ą";
        String e = "e";
        String e2 = "ę";
        String i = "i";
        String o = "o";
        String o2 = "ó";
        String u = "u";
        String t = "t";
        String y = "y";

        String bigA = "A";
        String bigA2 = "Ą";
        String bigE = "E";
        String bigE2 = "Ę";
        String bigI = "I";
        String bigO = "O";
        String bigO2 = "Ó";
        String bigU = "U";
        String bigY = "Y";

        double toReplace = 112.8;
        double toReplace2 = 57.1;
        double toReplace3 = 77.7;

        String sentence = "Oto zdanie, " + "w którym zamieniam samogłoski na liczby zmiennoprzecinkowe";

        String replacement = "_" + toReplace + "_";

        String replacement2 = String.valueOf(toReplace2);

        String replacement3 = "" + toReplace3;

        String zajavka = "zajavka";

        String replaced = sentence.replaceAll(a, replacement3);
        replaced = replaced.replaceAll(a2 ,replacement2);
        replaced = replaced.replaceAll(e ,replacement);
        replaced = replaced.replaceAll(e2 ,replacement3);
        replaced = replaced.replaceAll(i,replacement2);
        replaced = replaced.replaceAll(o ,replacement);
        replaced = replaced.replaceAll(o2 ,replacement3);
        replaced = replaced.replaceAll(u ,replacement2);
        replaced = replaced.replaceAll(t ,zajavka);
        replaced = replaced.replaceAll(y ,replacement);
        replaced = replaced.replaceAll(bigA ,replacement3);
        replaced = replaced.replaceAll(bigA2 ,replacement2);
        replaced = replaced.replaceAll(bigE ,replacement);
        replaced = replaced.replaceAll(bigE2 ,replacement3);
        replaced = replaced.replaceAll(bigI ,replacement2);
        replaced = replaced.replaceAll(bigO ,replacement);
        replaced = replaced.replaceAll(bigO2 ,replacement3);
        replaced = replaced.replaceAll(bigU ,replacement2);
        replaced = replaced.replaceAll(bigY ,replacement);

        System.out.println("original: " + sentence);
        System.out.println("replaced: " + replaced);
        System.out.println("----------------------------");

    }

//4. Napisz program, który będzie sprawdzał, czy w podanym zdaniu występuje słowo "friday".

    private static void exercise4() {
        String friday = "friday";
        boolean checker = friday.contains("friday");
        boolean checker2 = friday.contains("ridey");
        System.out.println("checker: " + checker + "\nchecker2: " + checker2);
        System.out.println("----------------------------");
    }

//5. Napisz program, który porówna 2 stringi w taki sposób żeby wynik "John".equals("john") zwrócił
//true.

    private static void exercise5() {
        String name = "John";
        boolean nameScanner = name.equalsIgnoreCase("john");
        boolean nameScanner2 = name.equals("john");
        System.out.println("nameScanner: " + nameScanner + "\nnameScanner2: " + nameScanner2);
        System.out.println("----------------------------");
    }

//6. Napisz program, który z podanego Stringa o długości dłuższej niż 10 znaków, wytnie string od
//    indeksu 3 o długości 5 znaków. Czyli np. dla stringa "SomeStringLongerThan10Signs" otrzymamy
//"eStri".

    private static void exercise6() {
        String text = "Za górami za lasami...";
        System.out.println(text.substring(3, 8));
    }

}
