package zajavka.day15;

import zajavka.day15.vegetable.Apple;

public class Modificators {
    // public
    // protected - dostep tylko w tej samej paczce, poza paczka za posrednictwem klasy podrzednej
    // default - dostep tylko w tej samej paczce
    // private - dostep tylko w klasie, w której jest stworzony
    // enkapsulacja, hermetyzacja - co da się schować to staramy się schować
    public static void main(String[] args) {


        Apple apple = new Apple("red", "jonagold");
        System.out.println(apple);
    }
}
