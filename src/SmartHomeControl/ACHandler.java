package SmartHomeControl;

public class ACHandler implements Handler {
    private Handler nextHandler;
    private AirConditioner ac;

    public ACHandler(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void setNext(Handler next) {
        this.nextHandler = next;
    }

    @Override
    public boolean handle(String request) {
        if (request.contains("打开空调")) {
            System.out.println(" -> VoiceHandler 处理并交由 ACHandler");
            ac.setStrategy(new FastResponseStrategy());
            ac.run(); // 执行策略，打印“立即开机”
            ac.turnOn(); // 触发状态变更到“开启状态”
            ac.startup(); // 执行模板方法启动流程
            return true;
        }
        if (nextHandler != null) {
            return nextHandler.handle(request);
        }
        return false;
    }
}
