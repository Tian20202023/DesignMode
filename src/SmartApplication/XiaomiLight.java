package SmartApplication;

public class XiaomiLight implements SmartLight,Cloneable {
    public String getDescription(){
        return "XiaomiLight（亮度80%，支持米家协议）";
    }

    public SmartLight clone()
    {
        XiaomiLight clone=null;
        try
        {
            clone=(XiaomiLight) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("Clone failure!");
        }
        return clone;
    }
}
