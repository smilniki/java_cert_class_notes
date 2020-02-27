package javacert.methods;

import java.util.ArrayList;
import java.util.List;

public class FinalVariables {

	// Note: keyword final used here
	private static final int SIZE = 10;
	
	private static final List<String> VALUES = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		int[] myArray = new int[SIZE];

//		SIZE = 11; //wont compile
//		SIZE++; //same
		
		int doubleSize = 2 * SIZE; //ok
		
		for (int i =0;i<SIZE;i++) {
			System.out.println(myArray[i]);
		}
		
		// this is ok bc changing final variable means reassigning it to point to another object
		// (which isnt whats goin on here)
		VALUES.add("changed");
		// can add, remove, clear, sort elems...
		// ie, can call methods on a final var
		
//		VALUES = new ArrayList<String>(); //wont compile
		
		final int myNumber = 10;
//		myNumber = 11; //wont compile
		
	}

}
