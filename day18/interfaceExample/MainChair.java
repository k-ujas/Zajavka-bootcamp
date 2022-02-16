package zajavka.day18.interfaceExample;

public class MainChair {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.doSomethingAsStrokeableChair();
        chair.gimmmeVoice();
        chair.sing("any song");
        chair.beStroked();
    }
}
