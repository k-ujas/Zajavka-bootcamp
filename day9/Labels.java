package zajavka.day9;

public class Labels {
    public static void main(String[] args) {
        first_loop: for (int i = 0; i < 4; i++) {
            System.out.println("first_loop: i = " + i);
            second_loop: for (int j = 0; j < 4; j++) {
                System.out.println("second_loop: i = " + i + ", j = " + j);
                third_loop: for (int k = 0; k < 4; k++) {
                    System.out.println("third_loop: i = " + i + ", j = " + j + ", k = " + k);
                    if (j == 2) {
                        continue;
                    }
                }
                break first_loop;
            }
        }
    }
}
