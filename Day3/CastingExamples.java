package zajavka.Day3;

public class CastingExamples {
    public static void main(String[] args) {
//rzutowanie
        byte a = (byte) 128;
        short b = (short) 32768;
        System.out.println(a); // show -128, if a = 129 b = -127
        System.out.println(b); // show -32768

        int c = 10;
        double d = (double) c;
        System.out.println(c); // show 10
        System.out.println(d); // show 10.0

        double e = 100.0;
        int f = (int) e;
        System.out.println(e); // show 100.0
        System.out.println(f); // 100

    }
}
