package CloudIntelligentConferenceSystem;

import java.util.List;
import java.util.ArrayList;

public class Meeting {
    private String agenda;
    private String time;
    private User host;
    private List<User> participants;

    public Meeting(String agenda, String time, User host, List<User> participants) {
        this.agenda = agenda;
        this.time = time;
        this.host = host;
        this.participants = new ArrayList<>(participants); // Ensure immutability of the list passed in
    }

    public String getAgenda() {
        return agenda;
    }

    public String getTime() {
        return time;
    }

    public User getHost() {
        return host;
    }

    public List<User> getParticipants() {
        return new ArrayList<>(participants);
    }

    @Override
    public String toString() {
        return "Meeting [agenda=" + agenda + ", time=" + time + ", host=" + host.getName() + ", participants=" + participants.size() + "]";
    }
}
