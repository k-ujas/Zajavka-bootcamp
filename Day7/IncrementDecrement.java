package zajavka.Day7;

public class IncrementDecrement {
    public static void main(String[] args) {
        //a++ = /postinkrementacja
        //++a = a = a + 1 /preinkrementacja
        //a-- = /postdekrementacja
        //--a = a = a - 1 /predekrementacja
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;

        someMethod(a++); // 1
        someMethod(a); // 2
        someMethod(++b); // 2
        someMethod(a); // 2
        someMethod(c--); // 1
        someMethod(c); // 0
        someMethod(--d); // 0
        someMethod(d); // 0
    }
    private static void someMethod(int someValue) {
        System.out.println("someValue: " + someValue);
    }
}
