package Bridge;

import java.sql.SQLOutput;

public class EmailSender implements MessageSender {
    public String send() {
        return ("[Email]");
    }
}
