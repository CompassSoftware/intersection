
/**
 * Please let me know if you
 * have a good way to include 
 * testing this thing in Junit.
 * 
 * I couldn't figure out how to make it work
 * This is just here to verify that it kind of works.
 * 
 * @author tobin
 *
 */
public class DefaultControllerTest {

	/**
	 * main runs this thing
	 * @param args
	 */
	public static void main(String[] args){
		DefaultControllerTest t = new DefaultControllerTest();
		MainTest main = t.new MainTest();
		SideTest side = t.new SideTest();
		DefaultController d = new DefaultController(main, side);
		d.start();
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
