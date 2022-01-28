package zajavka.day14;

public class ShortHomework {
    public static void main(String[] args) {
//        Long sum = 0L;
        long sum = 0L; // szybciej sie wykona
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
