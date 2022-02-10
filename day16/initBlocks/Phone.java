package zajavka.day16.initBlocks;

public class Phone {
    {
        this.productionYear = "2021";
        printDuringInitBlock();
    }

    private String productionYear;

    public Phone() {
        System.out.println(Phone.class + " constructor called");
        this.productionYear = productionYear;
    }
    private void printDuringInitBlock() {
        System.out.println("I'm printing during init block in " + Phone.class);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "productionYear='" + productionYear + '\'' +
                '}';
    }
}
