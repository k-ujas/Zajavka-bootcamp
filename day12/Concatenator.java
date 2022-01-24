package zajavka.day12;

public class Concatenator {
    // modifier
    // class keyword
    // class name
    // brackets
    // body

    private String color;

    // constructor - used for creating an object
    // field(attribute) - variable providing the state of the object
    // method - behaviour of the object


    // method
    // modifier, returnType, name, arguments, brackets, body
    public String concatenate(String argument1, String argument2) {
        System.out.println(argument1 + argument2);
        return argument1 + argument2;
    }

    public static void main(String[] args) {
        Concatenator example = new Concatenator();
        String var1 = "arg1";
        String var2 = "arg2";
        System.out.println(example.concatenate(var1, var2));
    }

    // calling a method
    // method can be of type void

    // object - instance of a class, basic unit of OOP
    // object interacts with each other by methods and have state by fields
    // object has: state, behaviour, identity (uniqueness)
}
