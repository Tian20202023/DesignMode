package CloudIntelligentConferenceSystem;

public class WebComponentFactory implements ComponentFactory {
    public Notifier createNotifier() {return new WebNotifier();}
    public UI createUI() {return new WebUI();}
    public NetManager createNetManager() {return new WebNetManager();}
}
