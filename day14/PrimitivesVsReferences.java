package zajavka.day14;

public class PrimitivesVsReferences {
    public static void main(String[] args) {
        // STOS i STERTA
        // prymitywy zuzywaja mniej miejsca w pamieci
        // primitives:
        int a = 4;
        double d = 10.0;
        boolean f = false;

        // references:
        String abc = "abc";
        Dog dog1 = new Dog("DOG1");
        Dog dog2 = new Dog("DOG2");
        Dog dog3 = dog1;
        Dog dog4 = dog1;

        System.out.println(dog1);
        dog1.name = "DOG_OTHER";
        System.out.println(dog3);
    }
}
