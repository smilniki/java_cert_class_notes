package javacert.exceptions;

public class CatchWithReturn {

	//only case where finally block doesnt execute is when System.exit() called
	//this terminates JVM
	
	public static void main(String[] args) {
		System.out.println(calculate());
//		error
//		finally
//		0
	}
	
	public static int calculate() {
		try {
			return 10/0;
		} catch (ArithmeticException e) {
			System.out.println("error");
			//if System.exit() here, only error is printed
			return 1;
		} finally { //this is executed!!!
			System.out.println("finally");
			return 0; //if this commented out, code still compiles ... prints error/finally/1
		}
	}
}
