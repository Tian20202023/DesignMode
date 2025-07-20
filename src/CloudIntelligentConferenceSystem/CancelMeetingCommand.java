package CloudIntelligentConferenceSystem;

public class CancelMeetingCommand implements Command {
    private MeetingSystem meetingSystem;
    private Meeting meetingToCancel;

    public CancelMeetingCommand(MeetingSystem meetingSystem, Meeting meetingToCancel) {
        this.meetingSystem = meetingSystem;
        this.meetingToCancel = meetingToCancel;
    }

    @Override
    public void execute() {
        meetingSystem.endMeeting(meetingToCancel);
    }

    @Override
    public void undo() {

    }
} 