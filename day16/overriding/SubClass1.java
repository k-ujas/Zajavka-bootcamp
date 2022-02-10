package zajavka.day16.overriding;

import zajavka.day15.vegetable.Orange;
import zajavka.day15.vegetable.Vegetable;

public class SubClass1 extends SuperClass1 {

    private String privateMethod1() {
        return "SubClass privateMethod";
    }
    @Override
    String defaultMethod1() {
        return "SubClass defaultMethod";
    }
    @Override
    protected String protectedMethod1() {
        return "SubClass protectedMethod";
    }
    @Override //nadpisuje metode ktora jest w klasie nadrzednej i ma ta sama nazwe
    public String publicMethod1() {
        System.out.println("Print something");
        super.publicMethod1();
        return "SubClass publicMethod";
    }
    @Override
    public Vegetable vegetable(String color) {
        return new Orange("blue", "niebieska");
    }
}
