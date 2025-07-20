package CloudIntelligentConferenceSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("用户：点击“发起会议”");

        MeetingSystem meetingSystem = new MeetingSystem();

        // 系统使用建造者构建会议对象 (输出在 MeetingSystem.createMeeting 中)
        ConcreteMeetingBuilder concreteBuilder = new ConcreteMeetingBuilder();
        concreteBuilder.createNewMeeting();
        concreteBuilder.setAgenda("智能会议");
        concreteBuilder.setTime("2023-10-27 10:00");
        concreteBuilder.setHost(new User("会议主持人"));

        CreateMeetingCommand createCommand = new CreateMeetingCommand(meetingSystem, concreteBuilder);
        meetingSystem.executeCommand(createCommand);

        // 选择 Web 平台组件工厂，创建 UI/通知器 (输出在 MeetingSystem.setComponentFactory 中)
        ComponentFactory webFactory = new WebComponentFactory();
        meetingSystem.setComponentFactory(webFactory);

        // 调用 MeetingSystem.createMeeting() 触发一系列操作
        meetingSystem.triggerMeetingStartOperations();

        // 注册观察者：前端 UI、日志模块、远程监听器
        meetingSystem.registerObservers();

        // 应用 PerformanceFirstStrategy 进行资源调度
        SchedulingStrategy performanceStrategy = new PerformanceFirstStrategy();
        meetingSystem.applyResourceScheduling(performanceStrategy);

        // 添加关键词分析记录器装饰器
        MeetingRecord basicRecord = new ConcreteMeetingRecord("原始会议记录内容");
        meetingSystem.addMeetingRecordEnhancement(basicRecord);

        // 用户点击“撤销会议”，命令执行 undo()，回滚创建动作
        meetingSystem.triggerUndoCommand();
    }
} 