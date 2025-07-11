package Builder;

public class Computer {
    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getHardDisk() {
        return HardDisk;
    }

    public void setHardDisk(String hardDisk) {
        HardDisk = hardDisk;
    }

    public String getMainUnit() {
        return MainUnit;
    }

    public void setMainUnit(String mainUnit) {
        MainUnit = mainUnit;
    }

    public String getDisplay() {
        return Display;
    }

    public void setDisplay(String display) {
        Display = display;
    }

    private String CPU;
    private String Memory;
    private String HardDisk;
    private String MainUnit;
    private String Display;


}
