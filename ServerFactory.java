package AbstractFactoryPattern;

public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    //constructor to initialize the ServerFactory with RAM, HDD, CPU
    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    //to create and return instance of the Server
    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }
}
