
public class MainFlowController {
	
	private DefaultController defaultControl;
	private ISensor sensor;
	
	public MainFlowController( DefaultController d, ISensor s){
		defaultControl = d;
		sensor = s;
	}
	public void makeMainFlow(){
		if( defaultControl.getState() == defaultControl.SIDE_GREEN
				&& defaultControl.getTime() > 2){
			defaultControl.setTime( 2 );
		}
	}
}
