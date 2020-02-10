package javacert.operators;

public class AssignmentOperators {

	public static void main(String[] args) {
//		int x = 1.0; //doesnt compile
//		short y = 198135; //also doesnt compile
//		int z = 9f; // ''
//		long e = 193012948404998; // ''
		
		// Fixes:
		int x = (int)1.0; 
		short y = (short)198135;
		int z = (int)9f; 
		long e = 193012948404998L; 
		// casting is REQUIRED whenever you're going from larger data type to smaller (ie, primitives)
		
		System.out.println("x="+x);
		System.out.println("y="+y); // overflow happens (java automatically wraps around)
		System.out.println("z="+z);
		System.out.println("e="+e);
		
		//overflow and underflow with byte (-128 to 127)
		byte myByte = 127;
		byte mySecondByte = -128;
		
		System.out.println("myByte="+myByte);
		System.out.println("mySecondByte="+mySecondByte);
		
//		myByte = myByte+1; // wont compile bc RHS is int
		myByte++;
		
		mySecondByte--; 
		
		System.out.println("myByte="+myByte); //-128
		System.out.println("mySecondByte="+mySecondByte); //127
		
		short a = 10;
		short b = 20;
//		short c = a*b; //wont compile bc RHS is int
		short c = (short)(a*b); //need to convert whole result to short!
		System.out.println("c="+c); //200
		
	}

}
