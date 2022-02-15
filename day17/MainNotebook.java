package zajavka.day17;

public class MainNotebook {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("Lenovo", null, 2012);
        System.out.println(notebook.getCompany());
        System.out.println(notebook.getModel().toString());
        System.out.println(notebook.getProductionYear());
        //System.out.println(notebook.getArray().length);

        notebook.setCompany("\nHP");
        notebook.setModel("A50");
        notebook.setProductionYear(2014);
        System.out.println(notebook.getCompany());
        System.out.println(notebook.getModel());
        System.out.println(notebook.getProductionYear());
        notebook.setCompany("any");
        System.out.println(notebook.getCompany());

    }
}
