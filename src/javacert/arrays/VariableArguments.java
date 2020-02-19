package javacert.arrays;

import java.util.Arrays;

public class VariableArguments {

//	public static void main(String[] args) {
//		// var args are rep as array
//
//	}
	
	//Note: only 1 main method allowed
	// this is just a different way of writing the method! same stuff
	public static void main(String... args) {
		// var args are rep as array
		System.out.println(args.length);
//		System.out.println(Arrays.toString(args));
		
		print(args);
		print("Java");
		print("this", "is", "my", "string", "array"); //this is ok!
		print(new String[] {"this", "is", "my", "string", "array"}); //not necc
		
		// Var args are rep as an array but u can pass as many args as u want
		// no need to create an array when calling method w var args
		
	}
	
	//needs to be static to be called from other method
	private static void print(String...strings) {
		System.out.println(Arrays.toString(strings));
	}

}
