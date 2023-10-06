package AbstractFactoryPattern;

public class TestDesignPatterns {

    public static void main(String[] args) {
        testAbstractFactory(); //to demonstrate the Abstract Factory Pattern.
    }

    //demonstrates the Abstract Factory Pattern with creating instances of PC and Server
    private static void testAbstractFactory() {
        // Create an instance of PC using the PCFactory.
        Computer pc = ComputerFactory.getComputer(
                new PCFactory("2 GB", "500 GB", "2.4 GHz")
        );
        // Create an instance of Server using the ServerFactory.
        Computer server = ComputerFactory.getComputer(
                new ServerFactory("16 GB", "1 TB", "2.9 GHz")
        );
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}