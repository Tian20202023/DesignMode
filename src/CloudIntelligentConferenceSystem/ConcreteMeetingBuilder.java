package CloudIntelligentConferenceSystem;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMeetingBuilder implements MeetingBuilder {
    private String agenda;
    private String time;
    private User host;
    private List<User> participants;

    public ConcreteMeetingBuilder() {
        this.participants = new ArrayList<>();
    }

    @Override
    public void createNewMeeting() {
        // Reset builder for a new meeting
        this.agenda = null;
        this.time = null;
        this.host = null;
        this.participants = new ArrayList<>();
    }

    @Override
    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void setHost(User host) {
        this.host = host;
    }

    @Override
    public void addParticipant(User user) {
        this.participants.add(user);
    }

    @Override
    public Meeting getMeeting() {
        return new Meeting(agenda, time, host, participants);
    }
}
