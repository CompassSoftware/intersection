import static org.junit.Assert.*;

import org.junit.Test;


public class TimerTest {

	@Test
	public void testStart() {
		long time1 = System.currentTimeMillis();
		new Timer().start(1000);
		long time2 = System.currentTimeMillis();
		assertTrue("Timer didn't run as long as it should", time2 - time1 > 1000);
	}

	@Test
	public void testHasExpired() {
		Timer t = new Timer();
		t.start(500);
		assertTrue("HasExpired returned true while timer was still running", t.hasExpired());
	}

}
