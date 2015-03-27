
public class SimpleStdBulb implements IStdBulb
{
    private boolean lightOn;
    /**
     * No-arg constructor for creating a simple bulb.
     */
    public SimpleStdBulb()
    { lightOn = false; }
    /**
     * Method inherited from IStdBulb for turning on.
     */
    public boolean on()
    {
        if(isOn())
        { System.out.println("The light is off."); }
        else{
            System.out.println("Turning the light on.");
            lightOn = !lightOn;
        }
        return lightOn;
    }
    /**
     * Method inherited from IStdBulb for turning off.
     */
    public boolean off()
    {
        if(isOn()){ 
            System.out.println("Turning the light off.");
            lightOn = !lightOn;
        }else
        { System.out.println("The light is off."); }
        return !lightOn;
    }
    
    /**
     * Method inherited from IStdBulb to indicate if on or not.
     */
    public boolean isOn()
    { return lightOn; }
}
