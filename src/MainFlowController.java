/**
 * Main Flow Controller
 * 
 * @author tobin
 *
 */
public class MainFlowController implements IController{
	
	private DefaultController defaultControl;
	
	/**
	 * constructor to create the main flow controller
	 * @param d
	 */
	public MainFlowController( DefaultController d ){
		defaultControl = d;
	}
	/**
	 * Performs a sensor action.
	 * 
	 * should be the implementor of an interface
	 */
	public void performSensorAction(){
		if( defaultControl.getState() == DefaultController.SIDE_GREEN
				&& defaultControl.getTime() > 2){
			defaultControl.setTime( 2 );
		}
	}
}
