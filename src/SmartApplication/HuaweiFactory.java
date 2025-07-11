package SmartApplication;

public class HuaweiFactory implements DeviceFactory{
    public SmartLight createSmartLight() {
        return new HuaweiLight();
    }
    public SmartAirConditioner createSmartAirConditioner() {
        return new HuaweiAirConditioner();
    }
    public SmartSpeaker createSmartSpeaker() {
        SmartSpeakerBuilder builder = new HuaweiSpeakerBuilder();
        Director director = new Director();
        director.setSmartSpeakerBuilder(builder);
        return director.construct();
    }
}
