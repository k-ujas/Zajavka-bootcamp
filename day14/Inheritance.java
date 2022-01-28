package zajavka.day14;

// subclass - klasy ktora dziedziczy z klasy bazowej
// superclass - klasa bazowa, z której jest dziedzicone
public class Inheritance {
    public static void main(String[] args) {
        Bike bike = new Bike();
        System.out.println(bike.company + " " + bike.model + " " + bike.beep());
    }
}
