/**
 * The main controller for the program.  Central hub where everything
 * is happening.
 * 
 * @author Fennerwe
 *
 */
public class ControlBox {
    private Timer timer;
    
    public static IStdLamp northRiversLeftLamp;
	public static IStdLamp northRiversRightLamp;
	public static IStdLamp southRiversRightLamp;
	public static IStdLeftLamp southRiversLeftLamp;
	public static IStdLamp eastCenterOnlyLamp;
	public static IStdLamp westCenterOnlyLamp;
	
	public static ISensor northRiversLeftSensor;
	public static ISensor northRiversRightSensor;
	public static ISensor southRiversLeftNearSensor;
	public static ISensor southRiversLeftFarSensor;
	public static ISensor southRiversRightSensor;
	public static ISensor eastCenterSensor;
	public static ISensor westCenterSensor;
	
	public static IStdCrossWalk leftNorthRiverStreetCross;
	public static IStdCrossWalk rightNorthRiverStreetCross;
	public static IStdCrossWalk leftSouthRiverStreetCross;
	public static IStdCrossWalk rightSouthRiverStreetCross;
	public static IStdCrossWalk topWestCenterStreetCross;
	public static IStdCrossWalk bottomWestCenterStreetCross;
	public static IStdCrossWalk topEastCenterStreetCross;
	public static IStdCrossWalk bottomEastCenterStreetCross;
	/**
	 * No-arg constructor for creating a a ControlBox with default settings.
	 */
	public ControlBox(){
		System.out.println("I am a ControlBox, hear me roar.");
		timer = new Timer();
		northRiversLeftLamp = new StdLamp();
		northRiversRightLamp = new StdLamp();
		southRiversRightLamp = new StdLamp();
		southRiversLeftLamp = new StdLeftLamp();
		eastCenterOnlyLamp = new StdLamp();
		westCenterOnlyLamp = new StdLamp();
		
		northRiversLeftSensor = new StdSensor();
		northRiversRightSensor = new StdSensor();
		southRiversLeftNearSensor = new StdSensor();
		southRiversLeftFarSensor = new StdSensor();
		southRiversRightSensor = new StdSensor();
		eastCenterSensor = new StdSensor();
		westCenterSensor = new StdSensor();
		
		northRiversLeftLamp = new StdLamp();
		northRiversRightLamp = new StdLamp();
		southRiversRightLamp = new StdLamp();
		southRiversLeftLamp = new StdLeftLamp();
		eastCenterOnlyLamp = new StdLamp();
		westCenterOnlyLamp = new StdLamp();
		
		leftNorthRiverStreetCross = new StdCrosswalk();
		rightNorthRiverStreetCross = new StdCrosswalk();
		leftSouthRiverStreetCross = new StdCrosswalk();
		rightSouthRiverStreetCross = new StdCrosswalk();
		topWestCenterStreetCross = new StdCrosswalk();
		bottomWestCenterStreetCross = new StdCrosswalk();
		topEastCenterStreetCross = new StdCrosswalk();
		bottomEastCenterStreetCross = new StdCrosswalk();
		
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
