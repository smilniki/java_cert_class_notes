package javacert.basics;

public class UnderstandingNull {

	// in java, everything is object
	// variable = a reference to an object
	// null indicates unset reference / ref to nothing ("empty container")
		// --> calling these often leads to NullPointerException
	
	static Object myObject = new Object();
	static Object myOtherObject; //is null by default

	static String myString; //empty container; can't call methods on empty containers
	
	public static void main(String[] args) {
		 Object myLocalObject = new Object();
		 Object anotherLocalObject;
		 
		 String name = "Java";
		 String anotherName = null;
		 
		 System.out.println("myObject: "+myObject);
		 System.out.println("myOtherObject: "+myOtherObject);
		 
		 System.out.println("myLocalObject: "+myLocalObject);
//		 System.out.println("anotherLocalObject: "+anotherLocalObject); //not initialized so cant use it (comp error)
		 
		 
		 System.out.println("anotherName: "+anotherName);
		 
		 // raises NullPointerException:
//		 myString.toLowerCase();
//		 System.out.println("myString: "+myString);
		 
		 //fix:
		 myString = "HELLO";
				 
		 myString.toLowerCase(); //wont actually work bc strings are immutable lol
		 System.out.println("myString: "+myString);
	}

}
