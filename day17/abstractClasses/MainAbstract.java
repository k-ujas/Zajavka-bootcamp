package zajavka.day17.abstractClasses;

public class MainAbstract {
    public static void main(String[] args) {
//        Vegetable vegetable = new Vegetable("red");
//        Onion onion = new Onion("red", "cebula");
        OnionChild onionChild = new OnionChild("dziecko", "gold");
        Tomato tomato = new Tomato("red", "pomidor");
        Cucumber cucumber = new Cucumber("green", "ogorek");

        tomato.buildMyHouse();
    }
}
