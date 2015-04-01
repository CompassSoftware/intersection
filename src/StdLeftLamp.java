/**
 * Class for a StdLamp with left turn green and yellow lights.
 * @author Nicholas Phillips
 *
 */
public class StdLeftLamp implements IStdLeftLamp
{
	private IStdBulb[] bulbs;
	private int RED = 0;
	private int LYELLOW = 1;
	private int RYELLOW = 2;
	private int LGREEN = 3;
	private int RGReen = 4;
    
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
		boolean a = bulbs[LYELLOW].off();
		boolean b = bulbs[RYELLOW].off();
		boolean c = bulbs[LGREEN].off();
		boolean d = bulbs[RGREEN].off();
		boolean e = bulbs[RED].on();
	    return a && b && c && d && e;
	}
	
	/**
	 * Method inherited from IStdLamp for turning yellow.
	 */
	public boolean yellow()
	{
	    boolean a = bulbs[RED].off();
	    boolean b = bulbs[LGREEN].off();
	    boolean c = bulbs[RGREEN].off();
	    boolean d = bulbs[LYELLOW].on();
	    boolean e = bulbs[RYELLOW].on();
        return a && b && c && d && e;
	}
	
	/**
	 * Method inherited from IStdLamp for turning green.
	 */
	public boolean green()
	{
	    boolean a = bulbs[RED].off();
	    boolean b = bulbs[LYELLOW].off();
	    boolean c = bulbs[RYELLOW].off();
	    boolean d = bulbs[LGREEN].on();
	    boolean e = bulbs[RGREEN].on();
        return a && b && c && d && e;
	}
}
