package zajavka.day18.interfaceExample;

public interface Voiceable {

    String gimmmeVoice();

    void sing(String songName);

    default void sing2(String songName) {
        singMeASongWithName(songName);
    }

    private void singMeASongWithName(String songName) {
        System.out.println("Default singing song method " + songName);
    }

    ;



//    Integer method3(String argument1, String argument2);
}
