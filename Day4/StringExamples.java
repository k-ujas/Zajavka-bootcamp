package zajavka.Day4;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = "Hello World!"; // JVM will check word in String Pool
        String s3 = "Hello World!";

        System.out.println("s1 == s2: " + (s1 == s2)); //check: s1 and s2 are in the same place in memory = true
        System.out.println("s1 == s3: " + (s1 == s3)); //check: s1 and s3 are in the same place in memory = true
        System.out.println("s1.equals(s2): " + s1.equals(s2)); //check word(s1) == word(s2) = true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // check word(s1) == word(s3) = true
        System.out.println("s1.equals(s3): " + s1.equalsIgnoreCase(s3)); //true


        System.out.println();

        char[] charArr = {'H', 'e','l', 'l','o',' ','W','o','r','l','d','!'}; // create Array
        String s4 = new String("Hello World!"); //create new String object
        String s5 = new String(charArr);

        System.out.println("s1 == s4: " + (s1 == s4)); //check: s1 and s4 are in the same place in memory = false(new object)
        System.out.println("s1 == s5: " + (s1 == s5)); //check: s1 and s5 are in the same place in memory = false

        System.out.println("s1.equals(s4): " + s1.equals(s4)); // true
        System.out.println("s1.equals(s5): " + s1.equals(s5)); // true
    }
}
