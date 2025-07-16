package cor;

public class Client {
    public static void main(String[] args) {
        // 创建处理器实例
        LeaveHandler teamLeader = new TeamLeaderHandler();
        LeaveHandler manager = new ManagerHandler();
        LeaveHandler director = new DirectorHandler();

        // 构建审批链：组长 → 经理 → 总监
        teamLeader.setNextHandler(manager);
        manager.setNextHandler(director);

        // 提交请假申请
        teamLeader.handleRequest(new LeaveRequest("张三", 2));
        teamLeader.handleRequest(new LeaveRequest("李四", 5));
        teamLeader.handleRequest(new LeaveRequest("王五", 10));
    }
}
