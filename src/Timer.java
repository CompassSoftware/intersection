/**
 * Used for timing events.
 * @author Fennerwe
 *
 */
public class Timer {
	
	private boolean isRunning = false;

	/**
	 * Starts the timer running by putting the current thread to sleep.
	 * 
	 * @param timeToRun - The time (in milliseconds) for the timer to run
	 */
	public void start(int timeToRun){
		try{
			isRunning = true;
			Thread.sleep((long)timeToRun);
		}catch(InterruptedException e){
			Thread.currentThread().interrupt();
			isRunning = false;
		}
	}
	
	/**
	 * Check to see if the timer has finished.
	 * 
	 * @return If the timer is running or not
	 */
	public boolean hasExpired(){
		return isRunning;
	}
}
