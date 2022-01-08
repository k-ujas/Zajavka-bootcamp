package zajavka.Day6;

public class Operators {
    public static void main(String[] args) {
        Operators operators = new Operators();
        operators.addition();
        System.out.println("------------");
        operators.subtraction();
        System.out.println("------------");
        operators.multiplication();
        System.out.println("------------");
        operators.division();
        System.out.println("------------");
        operators.modulus();

    }
    private void addition() {
        int a = 100 + 50;
        int b = a + 250;
        int c = a + b;

        System.out.println("a: " + a + "\nb: " + b + "\nc: " + c);
    }
    private void subtraction() {
        int a = 100 - 50;
        int b = a - 250;
        int c = b - b;

        System.out.println("a: " + a + "\nb: " + b + "\nc: " + c);
    }
    private void multiplication() {
        int a = 10 * 50;
        int b = a * 25;
        int c = a * b;

        System.out.println("a: " + a + "\nb: " + b + "\nc: " + c);
    }
    private void division() {
        int a = 10 / 2;
        int b = a / 5;
        int c = 100 / b;

        System.out.println("a: " + a + "\nb: " + b + "\nc: " + c);

        double d = 4/3; // = 1.0
        double e = (double)4/3; // = 1.333333333
        double f = 4/(double)3; // = 1.333333333
        double g = (double)(4/3); // = 1.0

        System.out.println("d: " + d + "\ne: " + e + "\nf: " + f + "\ng: " + g);
    }
    private void modulus() {
        int a = 4 % 3;
        int b = 11 % 3;
        int c = b % b;

        System.out.println("a: " + a + "\nb: " + b + "\nc: " + c);
    }

}
