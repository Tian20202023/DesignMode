package CloudIntelligentConferenceSystem;

public abstract class MeetingController {
    protected PlatformAPI platformAPI;

    public MeetingController(PlatformAPI platformAPI) {
        this.platformAPI = platformAPI;
    }

    public abstract void startVideo();
    public abstract void stopAudio();
    public abstract void startScreenShare();
    public abstract void sendMeetingMessage(String message);

    public void setPlatformAPI(PlatformAPI platformAPI) {
        this.platformAPI = platformAPI;
    }
} 