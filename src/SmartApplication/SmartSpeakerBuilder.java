package SmartApplication;

public abstract class SmartSpeakerBuilder {
    protected SmartSpeaker smartSpeaker=new SmartSpeaker();
    public abstract void buildWiFiModule();
    public abstract void buildAudioQuality();
    public abstract void buildVoiceAssistant();
    public SmartSpeaker getSmartSpeaker() {return smartSpeaker;}
}
