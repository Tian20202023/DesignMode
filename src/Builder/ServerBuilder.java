package Builder;

public class ServerBuilder extends ComputerBuilder{
    public void buildCPU(){
        System.out.println("CPU: Intel Xeon");
    }
    public void buildMemory(){
        System.out.println("Memory: 64GB ECC");
    }
    public void buildHardDisk(){
        System.out.println("Hard Disk: 2TB SAS");
    }
    public void buildMainUnit(){
        System.out.println("Main Unit: Rack case");
    }
    public void buildDisplay(){
        System.out.println("Display: None");
    }
}
