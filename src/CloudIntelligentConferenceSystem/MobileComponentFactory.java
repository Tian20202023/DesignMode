package CloudIntelligentConferenceSystem;

public class MobileComponentFactory implements ComponentFactory {
    public Notifier createNotifier() {return new MobileNotifier();}
    public UI createUI() {return new MobileUI();}
    public NetManager createNetManager() {return new MobileNetManager();}
}
