package CloudIntelligentConferenceSystem;

public class Director {
    private MeetingBuilder meetingBuilder;

    public void setMeetingBuilder(MeetingBuilder meetingBuilder) {
        this.meetingBuilder = meetingBuilder;
    }

    public Meeting constructMeeting() {
        meetingBuilder.createNewMeeting();
        meetingBuilder.setAgenda("Default Agenda");
        meetingBuilder.setTime("Default Time");
        meetingBuilder.setHost(new User("Default Host"));
        return meetingBuilder.getMeeting();
    }
} 