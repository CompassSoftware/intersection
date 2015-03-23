
public class StdLamp implements IStdLamp {

    IStdBulb[] bulbs;
    /**
     * No-arg constructor for creating default StdLamp.
     */
    public StdLamp(){
        bulbs = new IStdBulb[3];
        for(int i = 0; i < bulbs.length; i++)
        { bulbs[i] = new SimpleStdBulb(); }
    }
	@Override
	public boolean red() {
	    boolean a = bulbs[1].off();
        boolean b = bulbs[2].off();
        boolean c = bulbs[0].on();
        return a && b && c;
	}

	@Override
	public boolean yellow() {
	    boolean a = bulbs[0].off();
        boolean b = bulbs[2].off();
        boolean c = bulbs[1].on();
        return a && b && c;
	}

	@Override
	public boolean green() {
	    boolean a = bulbs[0].off();
        boolean b = bulbs[1].off();
        boolean c = bulbs[2].on();
        return a && b && c;
	}

}
