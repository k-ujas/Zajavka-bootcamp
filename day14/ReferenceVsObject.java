package zajavka.day14;

public class ReferenceVsObject {
    public static void main(String[] args) {
        RefGorilla refGorilla = new RefGorilla("10", "Robert");
        RefGorilla refGorilla2 = refGorilla;
        System.out.println(refGorilla.age + " " + refGorilla.name + " " + refGorilla.hasHair());
        refGorilla.name = "John";
        refGorilla.age = "76";
        // zmiana poprzez referencje pierwsza skutkuje na referencje druga, zmiany poprzez referencje dochodza na obiekcie
        System.out.println(refGorilla2.age + " " + refGorilla2.name);
    }
}
