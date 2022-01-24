package zajavka.day12;

public class VariableVisibilityScope {
    private void method() {


        String a = "value";
        {
            System.out.println(a);
            String b = "value2";
        }
//        System.out.println(b);
    }
    private void method2(String c) {

    }
    private void method3(String d) {

    }
}
