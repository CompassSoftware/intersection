/**
 * Standard Instance of All Crosswalk Lamps
 * @author loewna
 * @version 3.20.15
 */
public class StdCrosswalk implements IStdCrossWalk
{
	IStdBulb[] bulbs;
	
	/**
	 * Constructs a single standard crosswalk light.
	 * bulbs[0] = cross
	 * bulbs[1] = don't cross
	 */
	public StdCrosswalk()
	{
		bulbs = new IStdBulb[3]; 
		bulbs[0] = new SimpleStdBulb(); //Cross
		bulbs[1] = new SimpleStdBulb(); //Don't Cross
		bulbs[2] = new SimpleStdBulb(); //Cross Faster
	}
	
	/**
	 * Inherited method for setting crosswalk to WALK.
	 * @returns (a && b && c) - cross on, don't cross & cross faster off
	 */
	public boolean walk() 
	{
		boolean a = bulbs[0].on();
		boolean b = bulbs[1].off();
		boolean c = bulbs[2].off();
		return a && b && c;
	}

	/**
	 * Inherited method for setting crosswalk to CROSS FASTER.
	 * @return (a && b && c) - cross & don't cross off, cross faster on
	 */
	public boolean blinkingDontWalk()
	{
		boolean a = bulbs[2].on();
		boolean b = bulbs[0].off();
		boolean c = bulbs[1].off();
		return a && b && c;
	}

	/**
	 * Inherited method for setting crosswalk to DON'T WALK.
	 * @ returns (a && b && c) - cross & cross faster off, don't cross on
	 */
	public boolean dontWalk() 
	{
		boolean a = bulbs[1].on();
		boolean b = bulbs[0].off();
		boolean c = bulbs[2].off();
		return a && b && c;
	}
	
}
