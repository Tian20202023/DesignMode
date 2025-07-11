package SmartApplication;

public class Director {
    private SmartSpeakerBuilder ssb;
    public void setSmartSpeakerBuilder(SmartSpeakerBuilder ssb)
    {
        this.ssb=ssb;
    }
    public SmartSpeaker construct()
    {
        ssb.buildWiFiModule();
        ssb.buildAudioQuality();
        ssb.buildVoiceAssistant();
        return ssb.getSmartSpeaker();
    }
}
