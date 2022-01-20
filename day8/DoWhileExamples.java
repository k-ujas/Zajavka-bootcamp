package zajavka.day8;

public class DoWhileExamples {
    public static void main(String[] args) {
        // petla do while wykonuje się zawsze chociaż jeden raz
        int a = 1;
        do {
            System.out.println("a = " + a);
            a++;
//        } while (a == 10);
        } while (a < 5);
        System.out.println("end");
    }
}

