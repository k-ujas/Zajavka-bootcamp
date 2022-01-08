package zajavka.Day5;

public class StringPrintingExamples {
    public static void main(String[] args) {

        int a = 2;
        long b = 3;
        String c = "String";

        System.out.print(a + b + c);
        System.out.println(a + b + c);
        String someValue = "someValue is: " + a + " another value is: " + b + " and again value is: " + c;
        System.out.println(someValue);
        String anotherValue = String.format("someValue is: %s another value is: %s and again value is: %s", a, b, c);
        System.out.println(anotherValue);
        System.out.printf("printf: someValue is: %s another value is: %s and again value is: %s" ,a,b,c);
    }
}
