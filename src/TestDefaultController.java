import static org.junit.Assert.*;

import org.junit.Test;


public class TestDefaultController {

	@Test
	public void test() {
		
	}
	
	private class sideTest implements ILampGroup{
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
	
	private class mainTest implements ILampGroup{
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
