package zajavka.day14;

public class ClassToUseToString {
    private String company;
    private String model;
    private int productionYear;

    public ClassToUseToString(String company, String model, int productionYear) {
        this.company = company;
        this.model = model;
        this.productionYear = productionYear;
    }

// wymagane to String do wy
    @Override
    public String toString() {
        return "ThisExample{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
