package SmartHomeControl;

public class OffState implements DeviceState {
    @Override
    public void turnOn(SmartDevice device) {
        device.setState(new OnState());
    }

    @Override
    public void turnOff(SmartDevice device) {
        // 设备已关闭，无需重复操作
    }
}
