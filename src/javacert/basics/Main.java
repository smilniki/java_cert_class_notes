package javacert.basics;

import java.util.Random;

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
		
//		sum(a, b)
		
		//From "packages and imports module"
		Random random = new Random();
		System.out.println(random.nextInt(5)); 
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
