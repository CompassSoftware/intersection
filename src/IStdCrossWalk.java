/**
 * Interface for a standard crosswalk lamp
 * @author Nathan Mudford
 *
 */
public interface IStdCrossWalk {
	
	//time in each of the states walk and blinkingDontWalk;
	public static final int WALK_TIME = 10;
	public static final int BLINKING_DONT_WALK_TIME = 5;
	
	public boolean walk();
	public boolean blinkingDontWalk();
	public boolean dontWalk();
}
