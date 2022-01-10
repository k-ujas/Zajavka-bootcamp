package zajavka.day9;

public class LoopExamples {
    public static void main(String[] args) {
        someLoopingMethod2();

        for (int i = 0; i < 4; i++) {
            System.out.println("first_loop: i = " + i);
            for (int j = 0; j < 4; j++) {
                System.out.println("second_loop: i = " + i + ", j = " + j);
                for (int k = 0; k < 4; k++) {
                    System.out.println("third_loop: i = " + i + ", j = " + j + ", k = " + k);
                    if (j == 2) {
                        continue;
                    }
                }
            }
        }
    }

    public static void someLoopingMethod2() {
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("j = " + j);
                for (int k = 0; k < 3; k++) {
                    System.out.println("k = " + k);
                    if (j == 1) {
                        return;
                    }
                }
            }
        }
    }
}
