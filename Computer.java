package FactoryPattern;

public abstract class Computer {

    public abstract String getRAM(); //to get the RAM
    public abstract String getHDD(); //to get the HDD
    public abstract String getCPU(); //to get the CPU

    //overrides toString method
    //to provide a custom string representation of computer specifications
    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}