//Wyrażenia warunkowe - zadania

package zajavka.Homework.fourth;

import java.util.Scanner;

public class Day12Zajavka {
    public static void main(String[] args) {
        daysCalc();
        exercise4();
        //1. Napisz program sprawdzający, czy podany rok jest przestępny i na ekranie wydrukuj TAK lub NIE.
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("podaj rok, który chcesz sprawdzić czy jest przestępny:");
        a = input.nextInt();
        boolean b = (a % 4 == 0);
        boolean c = (a % 100 != 0);
        boolean d = (a % 400 == 0);
        if (b && c || d){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
//        switch (e){
//            case 0:
//                System.out.println("Rok " + a + " jest rokiem przestępnym");
//                break;
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Rok " + a + " nie jest rokiem przestępnym");
//                break;
//        }
        //2. Napisz program, który określi która z 3 podanych liczb jest największa
        int firstNumber, secondNumber, thirdNumber, max;
        System.out.println("Podaj pierwsza liczbę:");
        firstNumber = input.nextInt();
        System.out.println("Podaj drugą liczbę:");
        secondNumber = input.nextInt();
        System.out.println("Podaj trzecią liczbę:");
        thirdNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                max = firstNumber;
            } else {
                max = thirdNumber;
            }
        } else {
            if (secondNumber > thirdNumber) {
                max = secondNumber;
            } else {
                max = thirdNumber;
            }
        }
        System.out.println("max:" + max);
        //3. Napisz program, który sprawdzi czy dana liczba jest parzysta i wydrukuj na ekranie PARZYSTA lub
        //NIEPARZYSTA
        if (firstNumber % 2 == 0) {
            System.out.println("\nLiczba " + firstNumber + ", jest parzysta");
        } else {
            System.out.println("\nLiczba " + firstNumber + ", jest nieparzysta");
        }
    }
    //4. Napisz program, który na podstawie podanego numeru miesiąca, wydrukuje ile w takim miesiącu
    //mamy dni. W przypadku podania złej liczby dni, wydrukuje "Nie ma takiego miesiąca". Użyj switch

    private static void exercise4() {
        Scanner input = new Scanner(System.in);
        int month;
        System.out.println("Podaj miesiąc (od 1 styczeń do 12 grudzien) : ");
        month = input.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Dlugość wybranego miesiąca = 31 dni");
                break;
            case 2:
                System.out.println("Dlugość wybranego miesiąca = 28 lub 29 dni");
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Dlugość wybranego miesiąca = 30 dni");
                break;
            default:
                System.out.println("Nie ma takiego miesiąca");
                break;
        }
    }
    //5. Napisz switch, który policzy dla podanego numeru miesiąca, ile dni minęło od początku roku, do
    //końcowego dnia podanego miesiąca. Załóż, że luty ma 28 dni.
//    private static void exercise5() {
//        daysCalc(-12);
//        daysCalc(0);
//        daysCalc(1);
//        daysCalc(5);
//        daysCalc(9);
//
//    }

    private static void daysCalc() {
        Scanner input = new Scanner(System.in);
        int month;
        System.out.println("Podaj miesiąc (od 1 styczeń do 12 grudzien) : ");
        month = input.nextInt();
        int sum = 0;
        switch (month) {
            default:
                System.out.println("Wrong number passed");
                return;
            case 12:
                sum += 31;
            case 11:
                sum += 30;
            case 10:
                sum += 31;
            case 9:
                sum += 30;
            case 8:
                sum += 31;
            case 7:
                sum += 31;
            case 6:
                sum += 30;
            case 5:
                sum += 31;
            case 4:
                sum += 30;
            case 3:
                sum += 31;
            case 2:
                sum += 28;
            case 1:
                sum += 31;
        }
        System.out.println("Miesiąc: " + month + ", minęło dni: " + sum);
    }
}
