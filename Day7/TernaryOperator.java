package zajavka.Day7;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int result = a + b == 4 ? 12 : 15; // (true) lub (false) ? 12 = true , 15 = false
        String result2 = a + b == 3 ? "a + b == 3: yes" : "a + b == 3: no";
        System.out.println(result);
        System.out.println(result2);
    }
}
