package computer;

public class Computer {

    private int price;
    private String model;
    private RAM ram;
    private HDD hdd;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(int price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public Computer() {}

    public void getCompInformation () {
        System.out.println("Model: " + this.model +
                "; price: " + this.price +
                "; " + this.ram.getRAMInformation() +
                "; " + this.hdd.getHDDInformation() +
                "\n===========================");
    }

}
