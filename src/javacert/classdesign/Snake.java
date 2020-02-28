package javacert.classdesign;

public class Snake extends Reptile {
	
	@Override
	protected boolean hasLegs() {
		return false;
	}	
	
	@Override //bc same sig, ret type -- private & final methods cant be overriden
	public double getWeight() { //Note: can assign higher access (public works here)
		return 10.0; // CAN't assign weaker access (ex private)
	}
}
