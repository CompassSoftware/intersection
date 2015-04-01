/**
 * IntersectionMain is the application starting point 
 * 
 * All the external entities (lamps, sensors, etc.) are created here and connected to each other as needed.
 * 
 * @author jayfenwick
 *
 */
public class IntersectionMain {

	/* This models the Rivers Street and Center Street intersection.
	 * The one by JET bldg and tennis courts.
	 */
	public static ControlBox controlBox;

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
	
	public static void main(String[] args) {
		controlBox = new ControlBox();

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
	}
}
