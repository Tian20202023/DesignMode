package SmartApplication;

public class SmartSpeaker implements SmartDevice{
    public String getDescription() {
        return "SmartSpeaker";
    }
    private String WiFiModule;
    private String VoiceAssistant;
    private String AudioQuality;

    public String getWiFiModule() {
        return WiFiModule;
    }

    public void setWiFiModule(String wiFiModule) {
        WiFiModule = wiFiModule;
    }

    public String getVoiceAssistant() {
        return VoiceAssistant;
    }

    public void setVoiceAssistant(String voiceAssistant) {
        VoiceAssistant = voiceAssistant;
    }

    public String getAudioQuality() {
        return AudioQuality;
    }

    public void setAudioQuality(String audioQuality) {
        AudioQuality = audioQuality;
    }
}
