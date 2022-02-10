package zajavka.day15.vegetable;

public class Apple extends Vegetable {

    public String name;

    public Apple(String color, String name) {
        super(color);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
