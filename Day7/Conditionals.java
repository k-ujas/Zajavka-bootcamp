package zajavka.Day7;

public class Conditionals {
    public static void main(String[] args){
        if (true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int a = 1;
        int b = 9;

        if (a + b > 10) {
            System.out.println("a + b > 10");
        } else {
            System.out.println("a + b <= 10");
            System.out.println();
        }
        int c = 10;
        if (c > 0 && c <= 10) {
            System.out.println("c > 0 && c <= 10");
        } else if (c > 10 && c <= 100) {
            System.out.println("c > 10 && c <= 100");
        } else if (c > 100 && c <= 1000) {
            System.out.println("c > 10 && c <= 100");
        } else {
            System.out.println("SOME OTHER");
        }
    }
}
