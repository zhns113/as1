package AbstractFactoryPattern;

public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    //constructor to initialize PCFactory with RAM, HDD, CPU
    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    //to get creater pc with specs
    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
