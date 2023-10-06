package FactoryPattern;

public class Server extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    //constructor to initialize the RAM, HDD, CPU of server
    public Server(String ram, String hdd, String cpu) {
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
