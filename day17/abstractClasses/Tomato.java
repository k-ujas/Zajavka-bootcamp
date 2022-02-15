package zajavka.day17.abstractClasses;
// tomato = cat w kursie
public class Tomato extends Vegetable{

    private String name;

    public Tomato(String color, String name) {
        super(color);
        this.name = name;
    }

    @Override
    String gimmeVoice() {
        return "Tomato plum";
    }

    @Override
    protected void cutTheTreesOff() {
        System.out.println("cutTheTreesOff");
    }

    @Override
    protected void makeHoleInTheGround() {
        System.out.println("makeHoleInTheGround");
    }

    @Override
    protected void makeTheFoundations() {
        System.out.println("makeTheFoundations");
    }

    @Override
    protected void buildTheWalls() {
        System.out.println("buildTheWalls");
    }

    @Override
    protected void makeTheRoof() {
        System.out.println("makeTheRoof");
    }
}
