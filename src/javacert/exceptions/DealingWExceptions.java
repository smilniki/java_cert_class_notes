package javacert.exceptions;

public class DealingWExceptions {
	
	//Note: curly braces are required for try/catch block
	
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
//		int result = divide(a, b); //leads to ArithmeticException at runtime ... unchecked...
		//unchecked, so can catch and handle it
//		System.out.println("result= "+result);
		
		try { //exception occurs--> execution of try-block stops and goes to catch block
			int result = divide(a, b);
			System.out.println("result= "+result);
		} catch (ArithmeticException e) {
			//good practice to print stack trace here
			//or print/show some type of error
//			e.printStackTrace();
			System.out.println("Error: dividing message= "+e.getMessage());
		}
	}
	
	private static int divide(int a, int b) {
		return a/b;
	}

}
