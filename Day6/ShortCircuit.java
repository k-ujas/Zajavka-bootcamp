package zajavka.Day6;

public class ShortCircuit {

    public static void main(String[] args) {
        System.out.println("bool1 && bool2 = " + (bool1() && bool2()));
        System.out.println("bool1 & bool2 = " + (bool1() & bool2())); // << shortcircuit
    }

    private static boolean bool1() {
        System.out.println("calling bool1");
//        return true;
        return false;
    }
    private static boolean bool2() {
        System.out.println("calling bool2");
        return false;
    }
}
