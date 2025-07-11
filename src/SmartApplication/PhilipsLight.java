package SmartApplication;

public class PhilipsLight implements SmartLight,Cloneable{
    public String getDescription() {
        return "Philips Light";
    }

    public SmartLight clone()
    {
        PhilipsLight clone=null;
        try
        {
            clone=(PhilipsLight) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("Clone failure!");
        }
        return clone;
    }
}
