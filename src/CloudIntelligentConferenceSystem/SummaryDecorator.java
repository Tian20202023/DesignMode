package CloudIntelligentConferenceSystem;

public class SummaryDecorator extends MeetingRecordDecorator {
    public SummaryDecorator(MeetingRecord wrappedRecord) {
        super(wrappedRecord);
    }

    @Override
    public String getContent() {
        return wrappedRecord.getContent() + "\n[Summary Added: This is a summary of the meeting.]";
    }
} 