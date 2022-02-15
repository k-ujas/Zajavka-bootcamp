package zajavka.day17;

public class Notebook {

    private String company;

    private String model;

    private int productionYear;

    private int[] array;

    public Notebook(String company, String model, int productionYear) {
        this.company = company;
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model == null ? "default" : this.model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int[] getArray() {
        return this.array == null ? new int[0] : this.array;
    }

    public void setCompany(String company) {
        if ("any".equals(company)) {
            System.out.println("Bad company");
            return;
        }
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
