package zajavka.day17.abstractClasses;
// cucumber = monkey w kursie
public class Cucumber extends Vegetable{

    private String name;

    public Cucumber(String color, String name) {
        super(color);
        this.name = name;
    }

    @Override
    String gimmeVoice() {
        return "Cucumber hap hap!";
    }

    @Override
    protected void cutTheTreesOff() {

    }

    @Override
    protected void makeHoleInTheGround() {

    }

    @Override
    protected void makeTheFoundations() {

    }

    @Override
    protected void buildTheWalls() {

    }

    @Override
    protected void makeTheRoof() {

    }
}
