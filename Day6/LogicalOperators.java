package zajavka.Day6;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println("negacja (a = true): " + !a);

        System.out.println("\nfalse && false: " + (false && false));//koniunkcja
        System.out.println("false && true: " + (false && true));
        System.out.println("true && false: " + (true && false));
        System.out.println("true && true: " + (true && true));

        System.out.println("\nfalse || false: " + (false || false));//alternatywa
        System.out.println("false || true: " + (false || true));
        System.out.println("true || false: " + (true || false));
        System.out.println("true || true: " + (true || true));

        System.out.println("\nfalse == false: " + (false == false));//rownowaznosc
        System.out.println("false == true: " + (false == true));
        System.out.println("true == false: " + (true == false));
        System.out.println("true == true: " + (true == true));

        System.out.println("\nfalse != false: " + (false != false));//xor != lub ^
        System.out.println("false != true: " + (false != true));
        System.out.println("true != false: " + (true != false));
        System.out.println("true != true: " + (true != true));


    }
}
