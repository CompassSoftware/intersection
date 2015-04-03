import static org.junit.Assert.*;

import org.junit.Test;


public class TestMainFlowController {

	@Test
	public void test() {
		TestMainFlowController t = new TestMainFlowController();
		DefaultController d = new DefaultController(t.new MainTest(), t.new SideTest() );
		MainFlowController m  = new MainFlowController( d );
		d.setState( DefaultController.SIDE_GREEN);
		m.performSensorAction();
		assertEquals("Failed to change default controller", d.getTimeRemaining(), 2 );
	}

	/**
	 * The most basic of test classes to work with
	 * @author tobin
	 *
	 */
	private class SideTest implements ILampGroup{
		public void yellow(){
			System.out.println("side is yellow");
		}
		public void red(){
			System.out.println("side is red");
		}
		public void green(){
			System.out.println("side is green");
		}
	}
	/**
	 * The most basic of test classes to work with
	 * @author tobin
	 *
	 */
	private class MainTest implements ILampGroup{
		public void yellow(){
			System.out.println("main is yellow");
		}
		public void red(){
			System.out.println("main is red");
		}
		public void green(){
			System.out.println("main is green");
		}
	}
}
