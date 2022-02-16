package zajavka.day18.polymorphism;

public class MainDevice {

    public static void main(String[] args) {

        Bike bike1 = new Bike("red", true);
        Device bike2 = new Bike("blue", false);
        Object bike3 = new Bike("white", true);

        Cross cross1 = new Cross("yellow", 1.89);
        Device cross2 = new Cross("brown", 1.92);
        Object cross3 = new Cross("black", 1.90);

//        Cross no = new Bike("pink", true); <---- nie można tak

//        bike1.describe();
//        bike2.describe();
//        bike3.describe(); // <--- nie da się, object nie ma takiej metody

        DeviceSecond bikeSecond1 = new BikeSecond( false);
        DeviceSecond crossSecond1 = new CrossSecond( 1.92);

//        bikeSecond1.describe(); //polimorfizm tutaj
//        crossSecond1.describe(); //polimorfizm tutaj / 32 minuta

        BikeSecond bikeSecond2 = new BikeSecond(false);
        CrossSecond crossSecond2 = new CrossSecond(1.92);

//        bikeSecond2.isRoofOpened();
//        crossSecond2.getHeight();

        // teraz tworzymy 1000 obiektów przy wykorzystaniu petli

        DeviceSecond[] arr = new DeviceSecond[1000];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = new BikeSecond(i % 4 == 0);
            } else {
                arr[i] = new CrossSecond(1 + (double)i / 100);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("iter: " + i);
            arr[i].describe();
            opedDoor(arr[i]);
        }
    }
    private static void opedDoor(DeviceSecond deviceSecond) {
        System.out.println("I'm opening the door: " + deviceSecond);
    }
}
