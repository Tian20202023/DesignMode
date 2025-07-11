package SmartApplication;

public interface DeviceFactory {
    SmartLight createSmartLight();
    SmartAirConditioner createSmartAirConditioner();
    SmartSpeaker createSmartSpeaker();
}
