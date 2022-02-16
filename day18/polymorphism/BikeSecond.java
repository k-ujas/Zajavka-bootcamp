package zajavka.day18.polymorphism;

// bike = cabriolet w kursie
public class BikeSecond implements DeviceSecond {

    private boolean roofOpened;

    public BikeSecond(final boolean roofOpened) {
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
        System.out.println("Bike has opened roof: " + roofOpened);
        System.out.println("Bike description end");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "roofOpened=" + roofOpened +
                '}';
    }
}
