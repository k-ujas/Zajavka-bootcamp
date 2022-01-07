package zajavka.Day3;

public class FinalExamples {
    public static void main(String[] args) {
        final int a = 1;// final = a always is 1 because place "a" in memory show 1
        final int b = 2;
//        b = 6;// <<
        int c = b;
        c = 7;
        int d = c + 1;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}
