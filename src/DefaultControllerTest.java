

public class DefaultControllerTest {

	public static void main(String[] args){
		DefaultControllerTest t = new DefaultControllerTest();
		MainTest main = t.new MainTest();
		SideTest side = t.new SideTest();
		DefaultController d = new DefaultController(main, side);
	}
	
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
