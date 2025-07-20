package CloudIntelligentConferenceSystem;

public class SemanticAnalysisDecorator extends MeetingRecordDecorator {
    public SemanticAnalysisDecorator(MeetingRecord wrappedRecord) {
        super(wrappedRecord);
    }

    @Override
    public String getContent() {
        return wrappedRecord.getContent() + "\n[Semantic Analysis Added: Sentiment: Positive, Topics: Project X, Budget.]";
    }
} 