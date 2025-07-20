package CloudIntelligentConferenceSystem;

public class DesktopComponentFactory implements ComponentFactory {
    public Notifier createNotifier() {return new DesktopNotifier(); }
    public UI createUI() {return new DesktopUI();}
    public NetManager createNetManager() {return new DesktopNetManager();}
}
