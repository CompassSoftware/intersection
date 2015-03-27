/**
 * Class for a StdLamp with left turn green and yellow lights.
 * @author Nicholas Phillips
 *
 */
public class StdLeftLamp implements IStdLeftLamp
{
	IStdBulb[] bulbs;
    
    /**
	 * No-arg constructor for creating default StdLeftLamp.
	 */
	public StdLeftLamp(){
		bulbs = new IStdBulb[5];
		for(int i = 0; i < bulbs.length; i++)
		{ bulbs[i] = new SimpleStdBulb(); }
	}
	
	/**
	 * Method inherited from IStdLamp for turning red.
	 */
	public boolean red()
	{
		boolean a = bulbs[1].off();
		boolean b = bulbs[2].off();
		boolean c = bulbs[3].off();
		boolean d = bulbs[4].off();
		boolean e = bulbs[0].on();
	    return a && b && c && d && e;
	}
	
	/**
	 * Method inherited from IStdLamp for turning yellow.
	 */
	public boolean yellow()
	{
	    boolean a = bulbs[0].off();
	    boolean b = bulbs[3].off();
	    boolean c = bulbs[4].off();
	    boolean d = bulbs[1].on();
	    boolean e = bulbs[2].on();
        return a && b && c && d && e;
	}
	
	/**
	 * Method inherited from IStdLamp for turning green.
	 */
	public boolean green()
	{
	    boolean a = bulbs[0].off();
	    boolean b = bulbs[1].off();
	    boolean c = bulbs[2].off();
	    boolean d = bulbs[3].on();
	    boolean e = bulbs[4].on();
        return a && b && c && d && e;
	}
}
