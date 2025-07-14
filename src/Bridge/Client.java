package Bridge;

public class Client {
    public static void main(String[] args) {
        MessageSender emailSender=new EmailSender();
        CommonMessage commonMessage=new CommonMessage();
        commonMessage.setMessageSender(emailSender);
        commonMessage.send("请尽快提交日报！");
        MessageSender smsSender=new SmsSender();
        UrgentMessage urgentMessage=new UrgentMessage();
        urgentMessage.setMessageSender(smsSender);
        urgentMessage.send("【紧急】服务器宕机，请立即处理！");
    }
}
