package zajavka.day18.polymorphism;
// cross = suv w kursie
public class CrossSecond implements DeviceSecond {

    private double height;

    public CrossSecond(final double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(final double height) {
        this.height = height;
    }

    @Override
    public void describe() {
        System.out.println("Cross description start");
        System.out.println("Cross height: " + height);
        System.out.println("Cross description end");
    }

    @Override
    public String toString() {
        return "Cross{" +
                "height=" + height +
                '}';
    }
}
