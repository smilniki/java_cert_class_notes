package javacert.methods;

import java.util.ArrayList;
import java.util.List;

public class StaticInitialization {

	//static intializer is run when the class is first used
	
	private static final int SIZE;
	
	private static int one;
	private static final int two;
	private static final int three = 3;
	
	private static final List<String> NAMES = new ArrayList<String>();
//	private static final int four;
	
	// this is static init. Note: better to have just one but can have multiple
	static {
		System.out.println("First static init");
		int rows = 5;
		int cols = 4;
		SIZE = rows * cols; //gets rid of comp error on line 10
	}
	
	static {
		System.out.println("Second static init");
		one = 1;
		two = 2; //gets rid of comp error on line 13
		one = three; //(since one isnt final can assign multiple times)
		
//		three = 4; //cant do this
//		two = 2; //nope
		
	}
	
	static {
		System.out.println("Third static init");
		NAMES.add("Jimmy");
		NAMES.add("Peter");
	}
	
	public static void main(String[] args) {
		
		//Note: good idea to avoid static inits in general bc they make code hard to read
		
		// when class first used: main method run, which calls all static inits (in order)
		
		System.out.println(NAMES);

	}

}
