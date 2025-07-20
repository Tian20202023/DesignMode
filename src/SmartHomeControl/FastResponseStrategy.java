package SmartHomeControl;

public class FastResponseStrategy implements DeviceStrategy {
    @Override
    public void execute() {
        System.out.println(" -> 空调执行 FastResponseStrategy：立即开机");
    }
}
