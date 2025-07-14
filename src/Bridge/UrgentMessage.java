package Bridge;

public class UrgentMessage extends Message{
    public void send(String message){
        System.out.println("发送紧急消息:"+sender.send()+message);
    }
}

