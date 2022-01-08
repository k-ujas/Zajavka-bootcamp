package zajavka.Day6;

public class OperatorsComparison {
    public static void main(String[] args) {
        OperatorsComparison operators2 = new OperatorsComparison();
        operators2.comparison();
    }
    private void comparison() {
        int a = 1;
        int b = 2;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
    }
}
