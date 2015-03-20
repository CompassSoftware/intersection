/**
 * IntersectionMain is the application starting point 
 * 
 * All the external entities (lamps, sensors, etc.) are created here and connected to each other as needed.
 * 
 * @author jayfenwick
 *
 */
public class IntersectionMain {

	public static IStdLamp northRiversLeftLane;
	
	public static void main(String[] args) {
		northRiversLeftLane = new StdLamp();
	}
}
