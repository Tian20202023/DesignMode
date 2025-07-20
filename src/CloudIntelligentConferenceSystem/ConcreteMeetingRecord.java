package CloudIntelligentConferenceSystem;

public class ConcreteMeetingRecord implements MeetingRecord {
    private String basicContent;

    public ConcreteMeetingRecord(String basicContent) {
        this.basicContent = basicContent;
    }

    @Override
    public String getContent() {
        return basicContent;
    }
} 