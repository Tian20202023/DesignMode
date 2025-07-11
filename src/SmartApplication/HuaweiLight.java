package SmartApplication;

public class HuaweiLight implements SmartLight,Cloneable{
    public String getDescription() {
        return "Huawei Light";
    }

    public SmartLight clone()
    {
        HuaweiLight clone=null;
        try
        {
            clone=(HuaweiLight) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("Clone failure!");
        }
        return clone;
    }

}
