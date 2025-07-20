package SmartHomeControl;

public class OnState implements DeviceState {
    @Override
    public void turnOn(SmartDevice device) {
        // 设备已开启，无需重复操作
    }

    @Override
    public void turnOff(SmartDevice device) {
        device.setState(new OffState());
    }
}
