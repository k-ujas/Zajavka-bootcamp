package zajavka.day18.polymorphism;

// bike = cabriolet w kursie
public class Bike extends Device {

    private boolean roofOpened;

    public Bike(final String color, final boolean roofOpened) {
        super(color);
        this.roofOpened = roofOpened;
    }

    public boolean isRoofOpened() {
        return roofOpened;
    }

    public void setRoofOpened(final boolean roofOpened) {
        this.roofOpened = roofOpened;
    }

    @Override
    public void describe() {
        System.out.println("Bike description start");
        super.describe();
        System.out.println("Bike has opened roof: " + roofOpened);
        System.out.println("Bike description end");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "roofOpened=" + roofOpened +
                ", color='" + color + '\'' +
                '}';
    }
}
