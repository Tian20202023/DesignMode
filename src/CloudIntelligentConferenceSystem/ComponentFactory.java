package CloudIntelligentConferenceSystem;

public interface ComponentFactory {
    Notifier createNotifier();
    NetManager createNetManager();
    UI createUI();
}
