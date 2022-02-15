package zajavka.day17.abstractClasses;
// onion = dog w kursie
public abstract class Onion extends Vegetable {

    private String name;

    public Onion(String color, String name) {
        super(color);
        this.name = name;
    }
}
