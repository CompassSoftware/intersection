/**
 * Class for a StdLamp with left turn green and yellow bulbs.
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
	private int RGREEN = 4;
    
    /**
	 * No-arg constructor for creating default StdLeftLamp.
	 */
	public StdLeftLamp(){
		bulbs = new IStdBulb[5];
		for(int i = 0; i < bulbs.length; i++)
			bulbs[i] = new SimpleStdBulb();
	}
	
	/**
	 * Method inherited from IStdLamp for turning bulbs red.
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
	 * Method inherited from IStdLamp for turning bulbs yellow.
	 */
	public boolean yellow()
	{
	    boolean a = bulbs[RED].off();	    
	    boolean c = bulbs[RGREEN].off();
	    boolean e = bulbs[RYELLOW].on();
	    boolean l = leftYellow();
        return a && c && e && l;
	}
	
	/**
	 * Method inherited from IStdLeftLamp for turning left bulbs yellow.
	 */
	public boolean leftYellow()
	{
		boolean b = bulbs[LGREEN].off();
		boolean d = bulbs[LYELLOW].on();
		return b && d;
	}
	
	/**
	 * Method inherited from IStdLamp for turning bulbs green.
	 */
	public boolean green()
	{
	    boolean a = bulbs[RED].off(); 
	    boolean c = bulbs[RYELLOW].off();
	    boolean e = bulbs[RGREEN].on();
	    boolean l = leftGreen();
        return a && c && e && l;
	}
	
	/**
	 * Method inherited from IStdLeftLamp for turning left bulbs green.
	 */
	public boolean leftGreen()
	{
		boolean b = bulbs[LYELLOW].off();
		boolean d = bulbs[LGREEN].on();
		return b && d;
	}
}
