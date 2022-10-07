package computer;

public class HDD {

    private int volume;
    private String name;
    private Type type;


    public HDD(int volume, String name, Type type) {
        this.volume = volume;
        this.name = name;
        this.type = type;
    }

    public HDD() {
        this.type = Type.undefinded;
        this.name = "unknown";
        this.volume = 0;
    }

    public String getHDDInformation () {
        return "HDD {name: " + this.name + ", volume: " + this.volume + ", type: " + type.name() + "}";
    }
}
