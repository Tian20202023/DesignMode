package CloudIntelligentConferenceSystem;

import java.util.ArrayList;
import java.util.List;

public class MeetingSystem {
    private Director director;
    private ComponentFactory componentFactory;
    private MeetingController meetingController;
    private List<Observer> observers = new ArrayList<>();
    private SchedulingStrategy schedulingStrategy;
    private Invoker invoker;

    public MeetingSystem() {
        this.director = new Director();
        this.invoker = new Invoker();
    }

    public void setComponentFactory(ComponentFactory factory) {
        this.componentFactory = factory;
        System.out.println("-> 选择 " + factory.getClass().getSimpleName().replace("ComponentFactory", "") + "平台组件工厂，创建 UI/通知器");
    }

    public void setSchedulingStrategy(SchedulingStrategy strategy) {
        this.schedulingStrategy = strategy;
    }

    public void registerObservers() {
        this.addObserver(new UIObserver("前端 UI"));
        this.addObserver(new LoggerObserver());
        this.addObserver(new RemoteObserver());
        System.out.println("-> 注册观察者：前端 UI、日志模块、远程监听器");
    }


    public void applyResourceScheduling(SchedulingStrategy strategy) {
        setSchedulingStrategy(strategy);
        System.out.println("-> 应用 PerformanceFirstStrategy 进行资源调度");
    }


    public void addMeetingRecordEnhancement(MeetingRecord record) {
        MeetingRecord keywordDecoratedRecord = new KeywordDecorator(record);
        // In a real system, you might store or process this decorated record
        System.out.println("-> 添加关键词分析记录器装饰器");
    }


    public void triggerMeetingStartOperations() {
        System.out.println("-> 调用 MeetingSystem.createMeeting() 触发一系列操作");
    }


    public void triggerUndoCommand() {
        System.out.println("-> 用户点击“撤销会议”，命令执行 undo() ");
        undoLastCommand();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public Meeting createMeeting(MeetingBuilder builder) {
        director.setMeetingBuilder(builder);
        Meeting meeting = director.constructMeeting();
        System.out.println("-> 系统使用建造者构建会议对象");

        if (componentFactory != null) {
            Notifier notifier = componentFactory.createNotifier();
            UI ui = componentFactory.createUI();
            NetManager netManager = componentFactory.createNetManager();
        }

        if (schedulingStrategy != null) {
            schedulingStrategy.schedule(meeting);
        }

        return meeting;
    }

    public void startMeeting(Meeting meeting) {
        notifyObservers("Meeting '" + meeting.getAgenda() + "' started.");
    }

    public void endMeeting(Meeting meeting) {
        notifyObservers("Meeting '" + meeting.getAgenda() + "' ended.");
    }

    public void executeCommand(Command command) {
        invoker.executeCommand(command);
    }

    public void undoLastCommand() {
        invoker.undoLastCommand();
    }
} 