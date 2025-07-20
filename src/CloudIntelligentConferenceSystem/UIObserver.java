package CloudIntelligentConferenceSystem;

public class UIObserver implements Observer {
    private String uiName;

    public UIObserver(String uiName) {
        this.uiName = uiName;
    }

    @Override
    public void update(String message) {
    }
} 