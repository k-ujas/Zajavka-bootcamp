package zajavka.day13;

import java.math.BigDecimal;

public class EqualsAndHashCode {
    public static void main(String[] args) {
//        EqualsAndHashCode.simpleTypesComparison();
        System.out.println();
//        EqualsAndHashCode.decimalTypesComparison();
        EqualsAndHashCode.equalsExample();
    }

    private static void simpleTypesComparison() {
        System.out.println("19 == 19 : " + (19 == 19));
        System.out.println("19 != 19 : " + (19 != 19));
        System.out.println("10249L == 10249L : " + (10249L == 10249L));
        System.out.println("10249L != 10249L : " + (10249L != 10249L));
        System.out.println("'X' == 'X' : " + ('X' == 'X'));
        System.out.println("'X' != 'X' : " + ('X' != 'X'));
        System.out.println("true == true : " + (true == true));
        System.out.println("true != true : " + (true != true));
    }

    private static void decimalTypesComparison() {
        System.out.println("0.1 + 0.2 == 0.3: " + (0.1 + 0.2 == 0.3));
        System.out.println("0.1 + 0.2 == 0.3: " + (Math.abs(0.3 - (0.1 + 0.2)) < 0.0001));

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        BigDecimal bd3 = new BigDecimal("0.3");
        System.out.println(bd3 == bd1.add(bd2));
        System.out.println(bd3.equals(bd1.add(bd2)));
        System.out.println();
    }

    private static void equalsExample() {
        ThisExample car1 = new ThisExample("Mercedes", "A-Class", 2010);
        ThisExample car2 = new ThisExample("BMW", "X1", 2009);
        ThisExample car3 = new ThisExample("VW", "Golf", 2015);
        ThisExample car4 = new ThisExample("Audi", "A4", 2018);
        ThisExample car5 = new ThisExample("Audi", "A4", 2018);

        System.out.println(car4.equals(null));
        System.out.println(car4.equals(1));
        System.out.println(car4.equals("Hello"));
        System.out.println(car4.equals(car5));

        System.out.println("Hash example: \n");

        System.out.println("Hash1: " + car1.hashCode());
        System.out.println("Hash2: " + car2.hashCode());
        System.out.println("Hash3: " + car3.hashCode());
        System.out.println("Hash4: " + car4.hashCode());
        System.out.println("Hash5: " + car5.hashCode());

        System.out.println("and now: ");

        System.out.println("car4 == car5 :" + (car4 == car5));
        System.out.println("car4.equals(car5) :" + (car4.equals(car5)));

        // use alt + insert in ThisExample class, insert equals
    }
}
