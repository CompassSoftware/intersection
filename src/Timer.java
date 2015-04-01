/**
 * Used for timing events.
 * @author Fennerwe
 *
 */
public class Timer {
	private boolean isRunning = false;
	private boolean verbose = false;
	private int timeToRun = 1000;
	
	/**
	 * Creates a new timer with the specified values
	 * @param verbose - if true, info will be printed as the timer runs
	 * @param timeToRun - the default time for the timer to run
	 */
	public Timer(boolean verbose, int timeToRun){
		this.verbose = verbose;
		this.timeToRun = timeToRun;
	}
	
	/**
	 * No-arg constructor to create a new timer
	 */
	public Timer(){}

	/**
	 * Starts the timer running by putting the current thread to sleep.
	 * 
	 * @param timeToRun - The time (in milliseconds) for the timer to run
	 */
	public void start(int timeToRun){
		try{
			if(verbose) System.out.printf("Timer starting: %d ms\n", timeToRun);
			isRunning = true;
			Thread.sleep((long)timeToRun);
			if(verbose) System.out.println("Timer has finished");
		}catch(InterruptedException e){
		    Thread.currentThread().interrupt();
		    if(verbose) System.out.println("Timer was interrupted");
		    isRunning = false;
		}
	}
	
	/**
	 * Overloaded start method that uses the default time for this timer
	 */
	public void start(){
		try{
			if(verbose) System.out.printf("Timer starting: %d ms\n", this.timeToRun);
			isRunning = true;
			Thread.sleep((long)this.timeToRun);
			if(verbose) System.out.println("Timer has finished");
		}catch(InterruptedException e){
		    Thread.currentThread().interrupt();
		    if(verbose) System.out.println("Timer was interrupted");
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

	/**
	 * Checks if verbose mode is on
	 * @return Boolean for whether or not the verbose mode is on
	 */
	public boolean isVerbose() {
		return verbose;
	}

	/**
	 * Setter for verbose
	 * @param verbose - a variable for printing out additional information
	 */
	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	/**
	 * Returns the default time for this timer
	 * @return The default time
	 */
	public int getTimeToRun() {
		return timeToRun;
	}

	/**
	 * Sets the default time for this timer
	 * @param timeToRun - the default time to run
	 */
	public void setTimeToRun(int timeToRun) {
		this.timeToRun = timeToRun;
	}
	
	
}
