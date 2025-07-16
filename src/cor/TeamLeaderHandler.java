package cor;

public class TeamLeaderHandler extends LeaveHandler{
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() <= 3) {
            System.out.println(request.getName() + "请假" + request.getDays() + "天 → 组长审批通过");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
