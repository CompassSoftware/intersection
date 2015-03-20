
public class SimpleStdBulb implements IStdBulb
{
    private boolean lightOn;
    
    public SimpleStdBulb()
    { lightOn = false; }
    
    public boolean on()
    {
        if(lightOn)
        { System.out.println("The light is off."); }
        else{
            System.out.println("Turning the light on.");
            lightOn = !lightOn;
        }
        return lightOn;
    }
    
    public boolean off()
    {
        if(lightOn){ 
            System.out.println("Turning the light off.");
            lightOn = !lightOn;
        }else
        { System.out.println("The light is off."); }
        return !lightOn;
    }
}
