/**
 * Standard Instance of All Crosswalk Lamps
 * @author loewna, nathan mudford
 * @version 4.03.15
 */
public class StdCrosswalk implements IStdCrossWalk
{
	IStdBulb[] bulbs;
	IButton button;
	
	//crosswalk whose bulb states are paired with this.
	StdCrosswalk oppositeCW;
	
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
		oppositeCW = null;
		
	}
	
	/**
	 * Pairs this to oppositeCW (the one across the street)
	 * @param opposite crosswalk opposite of this which is being set
	 * @return true if the new opposite crosswalk is not null
	 */
	public boolean pair(StdCrosswalk opposite){
		if(opposite == null) return false;
		oppositeCW = opposite; 
		opposite.oppositeCW = this;
		return true;
	}
	
	/**
	 * Inherited method for setting crosswalk to WALK. Also sets the 
	 * other crosswalk to WALK. 
	 * @return true if oppositeCW != null and all bulbs are switched correctly
	 */
	public boolean walk() 
	{
		if(oppositeCW == null) 
			return false;
		boolean a = bulbs[0].on()  && oppositeCW.bulbs[0].on();
		boolean b = bulbs[1].off() && oppositeCW.bulbs[1].off();
		boolean c = bulbs[2].off() && oppositeCW.bulbs[2].off();
		return a && b && c;
	}

	/**
	 * Inherited method for setting crosswalk to CROSS FASTER. Also sets the 
	 * other crosswalk to CROSS FASTER.
	 * @return true if oppositeCW != null and all bulbs are switched correctly
	 */
	public boolean blinkingDontWalk()
	{
		if(oppositeCW == null) 
			return false;
		boolean a = bulbs[2].on()  && oppositeCW.bulbs[2].on();
		boolean b = bulbs[0].off() && oppositeCW.bulbs[0].off();
		boolean c = bulbs[1].off() && oppositeCW.bulbs[1].off();
		return a && b && c;
	}

	/**
	 * Inherited method for setting crosswalk to DON'T WALK. Also sets the 
	 * other crosswalk to DON'T WALK.
	 * @return true if oppositeCW != null and all bulbs are switched correctly
	 */
	public boolean dontWalk() 
	{
		if(oppositeCW == null) 
			return false;
		boolean a = bulbs[1].on()  && oppositeCW.bulbs[1].on();
		boolean b = bulbs[0].off() && oppositeCW.bulbs[0].off();
		boolean c = bulbs[2].off() && oppositeCW.bulbs[2].off();
		return a && b && c;
	}
}
