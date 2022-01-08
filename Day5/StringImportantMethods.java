package zajavka.Day5;

public class StringImportantMethods {
    public static void main(String[] args) {
        String s1 = "TodayIsFriday";
        System.out.println(s1.charAt(6)); // show letter on position 6 = s
        String s2 = "Day";
        String s3 = "day";
        System.out.println("Concat: " + s1.concat(s2));
        System.out.println("Equals: " + s1.equals(s2)); // false
        System.out.println("equalsIgnoreCase: " + s2.equalsIgnoreCase(s3)); // true
        System.out.println("Length: " + s1.length()); // word length (empty space too)
        System.out.println("Replace: " + s3.replace("day", "today")); // just here s3 = today
        System.out.println(s3); // s3 is still = day
        System.out.println("Substring: " + s1.substring(5)); // = IsFriday
        System.out.println("Substring: " + s1.substring(5, 7)); // = Is
        System.out.println("ToLowerCase: " + s1.toLowerCase());
        System.out.println("ToUpperCase: " + s1.toUpperCase());

        String s4 = "      text       ";
        System.out.println("Trim: " + s4.trim()); //delete spaces
        System.out.println("Contains: " + s4.contains("z")); // is "z" in word from s4?


    }
}
