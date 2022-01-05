package zajavka.Day2;

public class MainDay2 {
    public static void main(String[] args) {
        // entry point to my app

        Pig pig1 = new Pig(); //create new object
        Pig pig2 = new Pig();
        Horse horse1 = new Horse();
        System.out.println(pig1.leftLegBack); //show LLB
        System.out.println(pig1.leftLegFront);
        System.out.println(pig1.gimmeVoice()); //use method gimmeVoice
        System.out.println(horse1.gimmeVoice());
        newMethod(); //use method variable

        Bull bull1 = new Bull("Ed"); //create object with name
        Bull bull2 = new Bull("Tom");
        System.out.println(bull1.gimmeVoice());
        System.out.println("Bull1 name: " + bull1.getName());
        System.out.println(bull2.gimmeVoice());
        System.out.println("Bull2 name: " + bull2.getName());

        bull1.setName("Eddy"); //replace name on bull1
        bull2.setName("Tommy");
        System.out.println("Bull1 name: " + bull1.getName()); //change name bull1
        System.out.println("Bull2 name: " + bull2.getName()); //change name bull2


    }
    private static void newMethod() {
        String variable = "variable";
        System.out.println(variable);
    }
}
