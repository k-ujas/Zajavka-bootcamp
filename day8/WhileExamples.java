package zajavka.day8;

public class WhileExamples {
    public static void main(String[] args) {
        int i = 1;
        int j = 10;
        while (i < 10 && j > 5) {
            System.out.println("i = " + i + " j = " + j);
            i++;
            j--;
        }
        System.out.println("end of loop");
    }
}
