package CloudIntelligentConferenceSystem;

public abstract class MeetingRecordDecorator implements MeetingRecord {
    protected MeetingRecord wrappedRecord;

    public MeetingRecordDecorator(MeetingRecord wrappedRecord) {
        this.wrappedRecord = wrappedRecord;
    }

    @Override
    public String getContent() {
        return wrappedRecord.getContent();
    }
} 