package SmartApplication;

public class XiaomiFactory implements DeviceFactory {
    public SmartLight createSmartLight() {
        return new XiaomiLight();
    }
    public SmartAirConditioner createSmartAirConditioner(){
        return new XiaomiAirConditioner();
    }
    public SmartSpeaker createSmartSpeaker() {
        SmartSpeakerBuilder builder = new XiaomiSpeakerBuilder();
        Director director = new Director();
        director.setSmartSpeakerBuilder(builder);
        return director.construct();
    }
}
