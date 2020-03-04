package javacert.exceptions;

public class CheckedVsUnchecked {

	//Note: runtime exceptions also known as unchecked exceptions
	//checked exceptions include all subclasses of exceptions NOT including runtime exceptions
	
	//its OK to catch any type of exception
	//programmer is required to handle/declare checked exceptions
	
	//error is a subclass of Error and it's NOT ok to catch them. Also not req to handle/declare them
	
	public static void main(String[] args) { //not a good practice to have main throwing exception
											// but that gets rid of checked exception/compilation issue
//		myMethod(); //get comp error bc throwing a checked exception
		anotherMethod(); //runtime exception at runtime //stack trace printed in console
	}
	
	public static void anotherMethod() { //this will throw an unchecked exception
		throw new RuntimeException("Wrong parameter");
		
	}
	
	public static void myMethod() throws Exception { //indicates possibility of method to throw exception
		throw new Exception("Failed to load"); //want some other part of code to deal w exception
		
	}
	
	
}
