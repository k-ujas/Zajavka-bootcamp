package zajavka.Day2;

public class Bull {
    public Bull (String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String gimmeVoice() {
        return "Buuu";
    }
}
