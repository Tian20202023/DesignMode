package Prototype;

import java.io.*;

public class WeeklyLog implements Serializable {
    public String name;
    public String date;
    public String content;

    public Attachment getAttachment() {
        return this.attachment;
    }
    private Attachment attachment=null;

    public WeeklyLog(){
        this.attachment=new Attachment();
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        try (ByteArrayOutputStream bao = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bao)) {

            oos.writeObject(this);

            try (ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
                 ObjectInputStream ois = new ObjectInputStream(bis)) {
                return ois.readObject();
            }
        }
    }


}
