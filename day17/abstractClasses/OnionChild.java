package zajavka.day17.abstractClasses;
// onionchild = labrador w kursie
public class OnionChild extends Onion{

    public OnionChild(final String name, final String color) {
        super(color, name);
    }

    @Override
    String gimmeVoice() {
        return "OnionChild ciap ciap!";
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
