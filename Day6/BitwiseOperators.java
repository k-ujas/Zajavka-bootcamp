package zajavka.Day6;

public class BitwiseOperators {
    public static void main(String[] args) {
        byte a = 4;
        byte b = 5;
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("a << b: " + (a << 1)); // sign left shift
        System.out.println("a >> b: " + (a >> 1)); //sign right shift
        System.out.println("a >>> b: " + (a >>> 1)); //unsigned right shift


    }
}
