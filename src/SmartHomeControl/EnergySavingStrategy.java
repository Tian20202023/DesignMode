package SmartHomeControl;

public class EnergySavingStrategy implements DeviceStrategy {
    @Override
    public void execute() {
        System.out.println(" -> 空调自动降档运行（策略变更）");
    }
}
