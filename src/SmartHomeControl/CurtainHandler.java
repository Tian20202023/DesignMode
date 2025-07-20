package SmartHomeControl;

public class CurtainHandler implements Handler {
    private Handler nextHandler;
    private Curtain curtain;

    public CurtainHandler(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void setNext(Handler next) {
        this.nextHandler = next;
    }

    @Override
    public boolean handle(String request) {
        if (request.contains("打开窗帘")) {
            System.out.println("CurtainHandler: 正在处理 '打开窗帘' 指令。");
            curtain.turnOn(); // Use the state pattern to open curtain
            curtain.startup(); // Use the template method pattern for startup
            return true;
        }
        if (nextHandler != null) {
            return nextHandler.handle(request);
        }
        return false;
    }
}
