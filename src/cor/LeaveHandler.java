package cor;

public abstract class LeaveHandler {
    protected LeaveHandler nextHandler;

    // 设置下一个处理器
    public void setNextHandler(LeaveHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 处理请假请求（抽象方法）
    public abstract void handleRequest(LeaveRequest request);
}
