package FactoryPattern;

public class ComputerFactory {
    //static method that create and return instance of computer.
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("FactoryPattern.PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu); //if pc creates new pc object
        else if("FactoryPattern.Server".equalsIgnoreCase(type)) return new Server(ram,hdd, cpu); //if server creates new server object

        return null; // to return null if not recognized
    }
}