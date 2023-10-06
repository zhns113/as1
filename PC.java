package AbstractFactoryPattern;

public class PC extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    //constructor to initialize RAM, HDD, CPU of pc
    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    //to get the RAM
    @Override
    public String getRAM() {
        return this.ram;
    }

    //to get the HDD
    @Override
    public String getHDD() {
        return this.hdd;
    }

    //to get the CPU
    @Override
    public String getCPU() {
        return this.cpu;
    }
}

