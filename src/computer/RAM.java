package computer;

public class RAM {

    private String name;
    private int volume;

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public RAM() {
        this.name = "unknown";
        this.volume = 0;
    }

    public String getRAMInformation () {
        return "RAM {name: " + this.name + ", volume: " + this.volume + "}";
    }

}
