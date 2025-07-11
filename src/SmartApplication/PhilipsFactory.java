package SmartApplication;

public class PhilipsFactory implements DeviceFactory {
    public SmartLight createSmartLight() {
        return new PhilipsLight();
    }
    public SmartAirConditioner createSmartAirConditioner() {
        return new PhilipsAirConditioner();
    }
    public SmartSpeaker createSmartSpeaker() {
        SmartSpeakerBuilder builder = new PhilipsSpeakerBuilder();
        Director director = new Director();
        director.setSmartSpeakerBuilder(builder);
        return director.construct();
    }
}
