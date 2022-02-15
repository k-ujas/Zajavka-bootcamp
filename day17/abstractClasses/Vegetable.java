package zajavka.day17.abstractClasses;

public abstract class Vegetable {

    private String color;

    public Vegetable(final String color) {
        this.color = color;
    }
    abstract String gimmeVoice(); // nie moze byc private

    public void buildMyHouse() {
        cutTheTreesOff();
        makeHoleInTheGround();
        makeTheFoundations();
        buildTheWalls();
        makeTheRoof();
    }

    protected abstract void cutTheTreesOff();

    protected abstract void makeHoleInTheGround();

    protected abstract void makeTheFoundations();

    protected abstract void buildTheWalls();

    protected abstract void makeTheRoof();
}
