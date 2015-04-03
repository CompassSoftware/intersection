
public class StdLamp implements IStdLamp {

    private IStdBulb[] bulbs;
    private static final int RED = 0;
    private static final int YELLOW = 1;
    private static final int GREEN = 2;
    
    /**
     * No-arg constructor for creating default StdLamp.
     */
    public StdLamp(){
        bulbs = new IStdBulb[3];
        for(int i = 0; i < bulbs.length; i++)
        	bulbs[i] = new SimpleStdBulb();
    }
	@Override
	public boolean red() {
	    boolean a = bulbs[YELLOW].off();
        boolean b = bulbs[GREEN].off();
        boolean c = bulbs[RED].on();
        return a && b && c;
	}

	@Override
	public boolean yellow() {
	    boolean a = bulbs[RED].off();
        boolean b = bulbs[GREEN].off();
        boolean c = bulbs[YELLOW].on();
        return a && b && c;
	}

	@Override
	public boolean green() {
	    boolean a = bulbs[RED].off();
        boolean b = bulbs[YELLOW].off();
        boolean c = bulbs[GREEN].on();
        return a && b && c;
	}

}
