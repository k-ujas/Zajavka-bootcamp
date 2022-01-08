package zajavka.Day6;

public class NumericPromotion {
    public static void main(String[] args) {
        byte a = 4;
        short b = 5;
        int c = a + b; // now a and b get promotion to int
        short d = (short)(a + b); // now they are short type
        System.out.println(c);
        System.out.println(d);

        // read about promotion rules
    }
}
