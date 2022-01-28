package zajavka.day14;

public class ToString {
    public static void main(String[] args) {
        ClassToUseToString car1 = new ClassToUseToString("Mercedes", "A-Class", 2010);
        ClassToUseToString car2 = new ClassToUseToString("BMW", "X1", 2009);
        ClassToUseToString car3 = new ClassToUseToString("VW", "Golf", 2015);

        // do prawidlowego wyswietlenia potrzeba zdefiniowac toString w klasie ThisExample:
        //skrot ps i wybrac toString
//        @Override
//        public String toString() {
//            return "ThisExample{" +
//                    "company='" + company + '\'' +
//                    ", model='" + model + '\'' +
//                    ", productionYear=" + productionYear +
//                    '}';
//        }
        System.out.println(car1 + "\n" + car2 + "\n" + car3);
    }

}
