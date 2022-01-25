package zajavka.day13;

public class MethodsOverloading {

    private void overloadedMethod(String arg1, String arg2){
        System.out.println("String arg1 + String arg2: " + arg1 + arg2);
    }
    private void overloadedMethod(String arg1, String arg2, String arg3){
        System.out.println("String arg1 + String arg2 + String arg3: " + arg1 + arg2 + arg3);
    }
    private void overloadedMethod(String arg1, String arg2, String arg3, String arg4){
        System.out.println("String arg1 + String arg2 + String arg3 + String arg4: " + arg1 + arg2 + arg3 + arg4);
    }
    private void overloadedMethod(String arg1, String arg2, int arg3){
        System.out.println("String arg1 + String arg2 + int arg3: " + arg1 + arg2 + arg3);
    }
    private void overloadedMethod(String arg1, int arg2){
        System.out.println("String arg1 + int arg2: " + arg1 + arg2);
    }
    private void overloadedMethod(int arg1, String arg2){
        System.out.println("int arg1 + String arg2: " + arg1 + arg2);
    }
    private void overloadedMethod(String arg1){
        System.out.println("String arg1: " + arg1);
    }
    private void overloadedMethod(int arg1, int arg2){
        System.out.println("int arg1 + int arg2: " + arg1 + arg2);
    }
    private void overloadedMethod(float arg1, float arg2){
        System.out.println("float arg1 + float arg2: " + arg1 + arg2);
    }
}
