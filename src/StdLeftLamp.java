/**
 * Class for a StdLamp with left turn green and yellow lights.
 * @author Nicholas Phillips
 *
 */
public class StdLeftLamp implements IStdLeftLamp
{
	/**
	 * No-arg constructor for creating default StdLeftLamp.
	 */
	public StdLeftLamp()
	{
		
	}
	
	/**
	 * Method inherited from IStdLamp for turning red.
	 */
	public boolean red()
	{
		return false;
	}
	
	/**
	 * Method inherited from IStdLamp for turning yellow.
	 */
	public boolean yellow()
	{
		return false;
	}
	
	/**
	 * Method inherited from IStdLamp for turning green.
	 */
	public boolean green()
	{
		return false;
	}
}
