package CloudIntelligentConferenceSystem;

public class GeneralMeetingController extends MeetingController {
    public GeneralMeetingController(PlatformAPI platformAPI) {
        super(platformAPI);
    }

    @Override
    public void startVideo() {
        platformAPI.videoOn();
    }

    @Override
    public void stopAudio() {
        platformAPI.audioOff();
    }

    @Override
    public void startScreenShare() {
        platformAPI.shareScreen();
    }

    @Override
    public void sendMeetingMessage(String message) {
        platformAPI.sendMessage(message);
    }
} 