/**
 * Class for a StdLamp with left turn green and yellow lights.
 * @author Nicholas Phillips
 *
 */
public class StdLeftLamp implements IStdLamp
{
	IStdBulb[] bulbs;
    
    /**
	 * No-arg constructor for creating default StdLeftLamp.
	 */
	public StdLeftLamp()
	{
		bulbs = new IStdBulb[5];
		for(int i = 0; i < bulbs.length; i++)
		{ bulbs[i] = new SimpleStdBulb(); }
	}
	
	/**
	 * Method inherited from IStdLamp for turning red.
	 */
	public boolean red()
	{
		bulbs[1].off();
		bulbs[2].off();
		bulbs[3].off();
		bulbs[4].off();
		bulbs[0].on();
	    return false;
	}
	
	/**
	 * Method inherited from IStdLamp for turning yellow.
	 */
	public boolean yellow()
	{
	    bulbs[0].off();
        bulbs[3].off();
        bulbs[4].off();
        bulbs[1].on();
        bulbs[2].on();
	    return false;
	}
	
	/**
	 * Method inherited from IStdLamp for turning green.
	 */
	public boolean green()
	{
	    bulbs[0].off();
        bulbs[1].off();
        bulbs[2].off();
        bulbs[3].on();
        bulbs[4].on();
	    return false;
	}
}
