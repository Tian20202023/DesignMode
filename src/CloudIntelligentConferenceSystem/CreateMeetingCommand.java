package CloudIntelligentConferenceSystem;

public class CreateMeetingCommand implements Command {
    private MeetingSystem meetingSystem;
    private MeetingBuilder meetingBuilder;
    private Meeting createdMeeting;

    public CreateMeetingCommand(MeetingSystem meetingSystem, MeetingBuilder meetingBuilder) {
        this.meetingSystem = meetingSystem;
        this.meetingBuilder = meetingBuilder;
    }

    @Override
    public void execute() {
        createdMeeting = meetingSystem.createMeeting(meetingBuilder);
    }

    @Override
    public void undo() {
        if (createdMeeting != null) {
            System.out.println("-> 回滚创建动作");
        }
    }
} 