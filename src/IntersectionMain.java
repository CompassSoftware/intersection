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
	public static IStdLamp northRiversLeftLane;
	public static IStdLamp northRiversRightLane;
	public static IStdLamp southRiversRightLane;
	public static IStdLeftLamp southRiversLeftLane;
	public static IStdLamp eastCenterOnlyLane;
	public static IStdLamp westCenterOnlyLane;
	
	public static void main(String[] args) {
		northRiversLeftLane = new StdLamp();
		northRiversRightLane = new StdLamp();
		southRiversRightLane = new StdLamp();
		southRiversLeftLane = new StdLeftLamp();
		eastCenterOnlyLane = new StdLamp();
		westCenterOnlyLane = new StdLamp();
	}
}
