package zajavka.Day4;

public class Concatenation {
    public static void main(String[] args) {

        String hello = "Hello";
        String space = " ";
        String world = "world";
        String exclamation = "!";

        String result1 = hello + space + world + exclamation;
        System.out.println("result1 : " + result1); // ctrl + alt + n on result1
        System.out.println("result1 : " + (hello + space + world + exclamation)); // result after ctrl + alt + n
        System.out.println("result1 option2: " + hello + space + world + exclamation);

        String exampleConcat = hello.concat(space)
                                    .concat(world)
                                    .concat(exclamation);
        System.out.println("exampleConcat: " + exampleConcat);

        String result2 = 10 + 20 + hello + 30 + 40; // 30hello70?
        System.out.println(result2); // NO!
        System.out.println("result2: " + 10 + 20 + hello + 30 + 40);
        System.out.println(result2); // NO!
        String result3 = (10 + 20) + hello + (30 + 40); // 30hello70?
        System.out.println(result3); // YES!
        System.out.println();

//String builder
        StringBuilder sb = new StringBuilder();
        sb.append(hello);
        sb.append(space);
        sb.append(world);
        sb.append(exclamation);
        System.out.println(sb);
    }
}
