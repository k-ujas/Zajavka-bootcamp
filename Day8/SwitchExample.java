package zajavka.day8;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        someSwitch(5, 5);
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Podaj wartość a: ");
        a = input.nextInt();
        switch (a) {
            case 1:
                System.out.println("a == 12");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("a == 2 or 3 or 4");
                break;
            case 5:
                System.out.println("a == 5");
                break;
            case 10:
                System.out.println("a == 10");
                break;
            default:
                System.out.println("a = ?");
        }
    }
    private static void someSwitch(int a, int b) {
        switch (a + b) {
            case 1:
                System.out.println("case 1");
                return;
            case 2:
                System.out.println("case 2");
                return;
            case 5:
                System.out.println("case 5");
                return;
            case 10:
                System.out.println("case 10");
                return;
            default:
                System.out.println("default");
        }
    }
}
