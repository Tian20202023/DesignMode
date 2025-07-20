package CloudIntelligentConferenceSystem;

public class KeywordDecorator extends MeetingRecordDecorator {
    public KeywordDecorator(MeetingRecord wrappedRecord) {
        super(wrappedRecord);
    }

    @Override
    public String getContent() {
        return wrappedRecord.getContent() + "\n[Keywords Added: keyword1, keyword2, keyword3.]";
    }
} 