package javacert.basics;

/**
 * 
 * @author fmilniki
 *
 */
public class Main {

	/**
	 * This is the main method
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("args-size=" + args.length);

		for (int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "]=" + args[i]);
		}
	} 
	
	/**
	 * Calculates sum of two integers
	 * 
	 * @param a operand
	 * @param b operand
	 * @return sum
	 */
	public static int sum(int a, int b) {
		return a+b;
	}
}
