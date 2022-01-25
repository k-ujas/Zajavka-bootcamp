package zajavka.day13;

import java.util.Objects;

public class ThisExample {
    private String company;
    private String model;
    private int productionYear;

    public ThisExample(String company, String model, int productionYear) {
        this.company = company;
        this.model = model;
        this.productionYear = productionYear;
    }

    //equals:
    // x.equals(x) should be always true
    // x.equals(y) == true -> y.equals(x) == true
    // x.equals(y) == true i y.equals(z) == true -> x.equals(z) == true
    // in case of null -> false

//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (obj instanceof ThisExample) {
//            ThisExample thisExample = (ThisExample) obj;
//            return company.equals(thisExample.company)
//                    && model.equals(thisExample.model)
//                    && productionYear == thisExample.productionYear;
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThisExample that = (ThisExample) o;

        if (productionYear != that.productionYear) return false;
        if (!Objects.equals(company, that.company)) return false;
        return Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        int result = company != null ? company.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + productionYear;
        return result;
    }
}
