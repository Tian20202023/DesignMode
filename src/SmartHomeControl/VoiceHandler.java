package SmartHomeControl;

public class VoiceHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler next) {
        this.nextHandler = next;
    }

    @Override
    public boolean handle(String request) {
        if (request.contains("语音输入")) {
            String actualCommand = request.replace("语音输入", "").trim();
            if (nextHandler != null) {
                return nextHandler.handle(actualCommand);
            }
            return true;
        }
        if (nextHandler != null) {
            return nextHandler.handle(request);
        }
        return false;
    }
}
