import static org.junit.Assert.*;

import org.junit.Test;


public class TimerTest {

	@Test
	public void testStart2000() {
		long time1 = System.currentTimeMillis();
		new Timer().start(2000);
		long time2 = System.currentTimeMillis();
		assertTrue("Timer didn't run as long as it should", time2 - time1 > 1999);
	}

	@Test
	public void testHasExpired() {
		Timer t = new Timer();
		t.start(500);
		assertTrue("HasExpired returned true while timer was still running", t.hasExpired());
	}
	
	@Test
	public void testConstructor(){
		Timer t = new Timer(true, 5000);
		assertTrue("Verbose not set correctly", t.isVerbose());
		assertTrue("Default time not set correctly", t.getTimeToRun() == 5000);
	}
	
	@Test
	public void testSetters(){
		Timer t = new Timer();
		t.setTimeToRun(5000);
		t.setVerbose(true);
		assertTrue("Verbose not set correctly", t.isVerbose());
		assertTrue("Default time not set correctly", t.getTimeToRun() == 5000);
	}
	
	@Test
	public void testDefaultStart(){
		long time1 = System.currentTimeMillis();
		new Timer().start();
		long time2 = System.currentTimeMillis();
		assertTrue("Timer didn't run as long as it should", time2 - time1 > 999);
	}

}
