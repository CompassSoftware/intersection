import java.util.TimerTask;

/**
 * Controller for default behavior
 * to get the discussion started
 * @author tobin
 *
 */
public class DefaultController {
	private static final int MAIN_GREEN = 0;
	private static final int MAIN_YELLOW = 1;
	private static final int SIDE_GREEN = 2;
	private static final int SIDE_YELLOW = 3;
	private static final int SIDE_GREEN_CROSSWALK = 4;
	private static final int MAIN_GREEN_LEFT_TURN = 5;
	
	private int timeRemaining;
	
	private int yellowTime = 2;
	private int sideTime = 10;
	private int mainTime = 20;
	
	private ILampGroup mainLamps;
	private ILampGroup sideLamps;
	
	private int state;
	
	private java.util.Timer timer;
	private TimerTask ticker;
	
	/**
	 * Starts the magic..
	 * 
	 * @param mainLamps
	 * @param sideLamps
	 */
	public DefaultController(ILampGroup mainLamps, ILampGroup sideLamps){
		timeRemaining = 120;
		this.mainLamps = mainLamps;
		this.sideLamps = sideLamps;
		ticker = new Ticker();
		
		timer = new java.util.Timer();
		timer.scheduleAtFixedRate(ticker, 0, 1000);
	}
	/**
	 * Time getter
	 * @return int the time remaining until the next state change
	 */
	public int getTime(){
		return timeRemaining;
	}
	/**
	 * Sets the time remaining until next state change
	 * @param time
	 */
	public void setTime(int time){
		timeRemaining = time;
	}
	/**
	 * another second has gone by
	 */
	public void tick(){
		timeRemaining --;
		checkStatus();
	}
	
	/**
	 * Has the timer expired?
	 */
	private void checkStatus(){
		if( timeRemaining == 0){
			changeState();
		}
	}
	/**
	 * it's time to change the lights
	 */
	private void changeState(){
		switch( state ){
		case MAIN_GREEN:
			state = MAIN_YELLOW;
			timeRemaining = yellowTime;
			mainLamps.yellow();
			break;
			
		case MAIN_YELLOW:
			state = SIDE_GREEN;
			timeRemaining = sideTime;
			mainLamps.red();
			sideLamps.green();
			break;
			
		case SIDE_GREEN:
			state = SIDE_YELLOW;
			timeRemaining = yellowTime;
			sideLamps.yellow();
			break;
			
		case SIDE_YELLOW:
			state = MAIN_GREEN;
			timeRemaining = mainTime;
			sideLamps.red();
			mainLamps.green();
			break;
			
		case SIDE_GREEN_CROSSWALK:
			// TODO complete this..
		case MAIN_GREEN_LEFT_TURN:
			// TODO complete this..
		}
	}
	
	/**
	 * TimerTask class because 
	 * we can't just pass a function
	 * as a parameter in java..
	 * 
	 * @author tobin
	 *
	 */
	private class Ticker extends TimerTask{
		/**
		 * The DefaultController ticks
		 * when the TimerTask runs it.
		 * 
		 * @overide
		 */
		public void run(){
			tick();
		}
	}
}
