package cor;

public class ManagerHandler extends LeaveHandler {
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() > 3 && request.getDays() <= 7) {
            System.out.println(request.getName() + "请假" + request.getDays() + "天 → 经理审批通过");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
