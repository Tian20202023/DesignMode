package CloudIntelligentConferenceSystem;

public interface MeetingBuilder {
    void createNewMeeting();
    void setAgenda(String agenda);
    void setTime(String time);
    void setHost(User host);
    void addParticipant(User user);
    Meeting getMeeting();
}
