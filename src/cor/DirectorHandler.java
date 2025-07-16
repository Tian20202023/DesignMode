package cor;

public class DirectorHandler extends LeaveHandler{
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() > 7) {
            System.out.println(request.getName() + "请假" + request.getDays() + "天 → 总监审批通过");
        } else{
            nextHandler.handleRequest(request);
        }
    }
}
