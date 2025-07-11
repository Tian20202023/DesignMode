package Builder;

public abstract class ComputerBuilder {
    Computer computer=new Computer();
    abstract void buildCPU();
    abstract void buildMemory();
    abstract void buildHardDisk();
    abstract void buildMainUnit();
    abstract void buildDisplay();
    public Computer getComputer(){return computer;}
}
