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
	public static IStdLamp southRiversLeftLamp;
	public static IStdLamp eastCenterOnlyLamp;
	public static IStdLamp westCenterOnlyLamp;
	
	public static ISensor northRiversLeftSensor;
	public static ISensor northRiversRightSensor;
	public static ISensor southRiversLeftNearSensor;
	public static ISensor southRiversLeftFarSensor;
	public static ISensor southRiversRightSensor;
	public static ISensor eastCenterSensor;
	public static ISensor westCenterSensor;
	
	public static StdCrosswalk leftNorthRiverStreetCross;
	public static StdCrosswalk rightNorthRiverStreetCross;
	public static StdCrosswalk leftSouthRiverStreetCross;
	public static StdCrosswalk rightSouthRiverStreetCross;
	public static StdCrosswalk topWestCenterStreetCross;
	public static StdCrosswalk bottomWestCenterStreetCross;
	public static StdCrosswalk topEastCenterStreetCross;
	public static StdCrosswalk bottomEastCenterStreetCross;
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
		leftNorthRiverStreetCross.pair(rightNorthRiverStreetCross);
		leftSouthRiverStreetCross = new StdCrosswalk();
		rightSouthRiverStreetCross = new StdCrosswalk();
		leftSouthRiverStreetCross.pair(rightSouthRiverStreetCross);
		topWestCenterStreetCross = new StdCrosswalk();
		bottomWestCenterStreetCross = new StdCrosswalk();
		topWestCenterStreetCross.pair(bottomWestCenterStreetCross);
		topEastCenterStreetCross = new StdCrosswalk();
		bottomEastCenterStreetCross = new StdCrosswalk();
		topEastCenterStreetCross.pair(bottomEastCenterStreetCross);
		
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
