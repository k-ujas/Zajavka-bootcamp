package zajavka.day16.initBlocks;

public class AnotherPhone extends Phone {
    //poczatek bloku inicjalizacyjnego
    {
        this.company = "Apple";
        printDuringInitBlock();
    }
    // koniec bloku

    private String company;
    private String model;

    public AnotherPhone(String productionYear, String company, String model) {
        System.out.println(AnotherPhone.class + " constructor called");
        this.company = company;
        this.model = model;
    }

    public AnotherPhone(String productionYear, String model) {
        this.model = model;
    }

    private void printDuringInitBlock() {
        System.out.println("I'm printing during init block in " + AnotherPhone.class);
    }

    @Override
    public String toString() {
        return "AnotherPhone{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                "} " + super.toString();
    }
}
