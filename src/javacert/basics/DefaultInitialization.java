package javacert.basics;

public class DefaultInitialization {

	static boolean myBoolean;
	static byte myByte;
	static short myShort;
	static int myInt;
	static long myLong;
	static float myFloat;
	static double myDouble;
	static char myChar;
	
	public static void main(String[] args) {
		int localInt; //is not initialized...if try to print wont compile
		
		System.out.println("myBoolean: "+myBoolean); // default is false
		System.out.println("myByte: "+myByte); // all defaults for numbers ~zero
		System.out.println("myShort: "+myShort);
		System.out.println("myInt: "+myInt);
		System.out.println("myLong: "+myLong);
		System.out.println("myFloat: "+myFloat);
		System.out.println("myDouble: "+myDouble);
		System.out.println("myChar: "+myChar); // is empty char by default (but has a value!)
	}

}
