package zajavka.Day5;

public class InternExamples {
    public static void main(String[] args) {
        String s1 = new String("JAVA");
        String s2 = new String("JAVA");
        System.out.println("s1 = s2: " + (s1 == s2)); // is the same place in memory? = false
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // word(s1) = word(s2) = true
        System.out.println("-------------------------------");

        String s3 = s1.intern();
        String s4 = s2.intern();
        System.out.println("s3 = s4: " + (s3 == s4)); // is the same place in memory? = true
        System.out.println("s3.equals(s4): " + s3.equals(s4)); // word(s3) = word(s4) = true
        System.out.println("-------------------------------");

        String s5 = s1 + s2;
        String s6 = "JAVAJAVA";
        System.out.println("s5 = s6: " + (s5 == s6)); // JAVA+JAVA = JAVAJAVA = NO!
        System.out.println("s5.equals(s6): " + s5.equals(s6)); // JAVA+JAVA = JAVAJAVA = YES!
        System.out.println("s5 = s6: " + (s5.intern() == s6)); // JAVA+JAVA = JAVAJAVA = YES! used .intern



    }
}
