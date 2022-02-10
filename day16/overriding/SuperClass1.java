package zajavka.day16.overriding;

import zajavka.day15.vegetable.Vegetable;

public class SuperClass1 {
    private String privateMethod1() {
        return "SuperClass privateMethod";
    }

    String defaultMethod1() {
        return "SuperClass defaultMethod";
    }

    protected String protectedMethod1() {
        return "SuperClass protectedMethod";
    }

    public String publicMethod1() {
        return "SuperClass publicMethod";
    }

    public Vegetable vegetable(String color) {
        return new Vegetable("blue");
    }
}
