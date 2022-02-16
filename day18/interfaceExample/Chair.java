package zajavka.day18.interfaceExample;

public class Chair implements ChairStrokable, Voiceable {
    @Override
    public void doSomethingAsStrokeableChair() {
        System.out.println("I like being stroked!");
    }

    @Override
    public void beStroked() {
        System.out.println("I am stroked and it's really nice!");
    }

    @Override
    public String gimmmeVoice() {
        return "I'm giving you my voice!";
    }

    @Override
    public void sing(String songName) {
        System.out.println("I'm singing the song: " + songName);
    }
}
