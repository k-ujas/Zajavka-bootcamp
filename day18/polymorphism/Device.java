package zajavka.day18.polymorphism;
// device = car w kursie
public class Device {

    protected String color;

    public Device(final String color) {
        this.color = color;
    }

    public void describe() {
        System.out.println("Device color: " + color);
    }
}
