package Builder;

public class Director {
    private ComputerBuilder cb;
    public void setComputer(ComputerBuilder cb){
        this.cb=cb;
    }
    public Computer construct(ComputerBuilder cb){
        cb.buildCPU();
        cb.buildMemory();
        cb.buildHardDisk();
        cb.buildMainUnit();
        cb.buildDisplay();
        return cb.computer;
    }

}
