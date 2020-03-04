package javacert.exceptions;

import javax.management.RuntimeErrorException;

public class CatchingExceptions {

	//for exam:
	// 1. must be able to recognize if exception is checked or unchecked
	// 2. see if any exceptions are subclasses of other ones
	
	public static void main(String[] args) {
		try {
			visitMuseum();
		} catch (MuseumClosedForLunch me) { //subclass note: can have multiple catch blocks for diff exceptions
			System.out.println("Closed for lunch");
		} catch (MuseumClosed mc) {
			System.out.println("Just closed"); //superclass
		} // Note: code won't COMPILE if superclass exception listed before subclass
		
		//nested try/catch blocks are possible
		System.out.println(calculate()); //startnpefinallyfinished
		
	}
	
	public static String calculate() {
		String result = "";
		String str = null;
		
		try {
			try {
				result += "start"; //start
				str.length();
				result += "end"; //doesnt execute
			} catch (NullPointerException ne) {
				result += "npe"; //startnpe
				throw new RuntimeException();
			} finally { //executed following the above blocks
				result += "finally"; //startnpefinally
				throw new Exception(); //this is the exception thats catched below (last thrown exception catched)
			}
		} catch (Exception e) { //startnpefinallyfinished
			result+="finished";
		}
		return result;
	}
	
	public static void visitMuseum() {
		boolean b = Math.random() < 0.5;
		
		if (b) {
			throw new MuseumClosed();
		}
		throw new MuseumClosedForLunch();
		
	}
	
}

class MuseumClosed extends RuntimeException {}

class MuseumClosedForLunch extends MuseumClosed {}

