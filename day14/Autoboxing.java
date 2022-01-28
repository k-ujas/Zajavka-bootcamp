package zajavka.day14;

public class Autoboxing {
    public static void main(String[] args) {
        byte b = 3;
        short s = 10;
        int i = 19;
        long l = 12;
        char c = 'c';

        // Wrapper classes
        Byte bC = b;
        Short sC = s;
        Integer iC = i;
        Long lC = l;
        Character cC = c;

        // autoboxing = int do Integer
        // unboxing = Integer do int

        int f = iC;
        System.out.println(f);
        method(iC, sC);

        String a = "12";
        Integer e = Integer.parseInt(a); // zamienia stringa na liczbe
        System.out.println(e);
    }
    private static void method(Integer a, Short b) {
        System.out.println(a + b);
    }

}
