package zajavka.Day6;

public class OperatorsPrecedence {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        int c = 4;

        int result = a + b * c; //22
        int result2 = (a + b) * c; //52

        System.out.println(result);
        System.out.println(result2);
    }
}