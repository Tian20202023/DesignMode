package Bridge;

import java.sql.SQLOutput;

public class CommonMessage extends Message{
    public void send(String message){
        System.out.println("发送普通消息:"+sender.send()+message);
    }
}
