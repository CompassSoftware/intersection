/**
 * The main controller for the program.  Central hub where everything
 * is happening.
 * 
 * @author Fennerwe
 *
 */
public class ControlBox {
    private Timer timer;
    //private ISensor[] sensors;
    private IStdLamp[] lamps;
    //private IStdCrossWalk[] crossWalks;
	/**
	 * No-arg constructor for creating a a ControlBox with default settings.
	 */
	public ControlBox(){
		System.out.println("I am a ControlBox, hear me roar.");
		timer = new Timer();
		//sensors = new ISensor[4];
		lamps = new IStdLamp[4];
		//crossWalks = new IStdCrossWalk[8];
		for(int i = 0; i < lamps.length; i++)
		{ lamps[i] = new StdLamp(); }
		//for (int i = 0; i < crossWalks.length; i++)
		//{ crossWalks[i] = new StdCrossWalk(); }
	}
	
	/**
     * Constructor for creating a ControlBox with settings from outside.
     */
	public ControlBox(IStdLamp[] lamps)
	{
	    timer = new Timer();
	    this.lamps = lamps;
	}
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		ControlBox cb = new ControlBox();
	}
}
