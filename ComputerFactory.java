package AbstractFactoryPattern;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer(); //to return the created computer instance.
    }
}
