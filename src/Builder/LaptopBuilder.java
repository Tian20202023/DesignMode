package Builder;

public class LaptopBuilder extends ComputerBuilder{
    public void buildCPU(){
        System.out.println("CPU: Intel i5");
    }
    public void buildMemory(){
        System.out.println("Memory: 16GB");
    }
    public void buildHardDisk(){
        System.out.println("Hard Disk: 512GB SSD");
    }
    public void buildMainUnit(){
        System.out.println("Main Unit: Compact case");
    }
    public void buildDisplay(){
        System.out.println("Display: 13.3 inch");
    }
}
