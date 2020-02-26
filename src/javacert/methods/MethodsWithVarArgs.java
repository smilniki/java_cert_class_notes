package javacert.methods;

import java.util.Arrays;

public class MethodsWithVarArgs {

	public void jump1(int... numbers) {}
	
	public void jump2(int start, int... numbers) {}
	
//	public void jump3(int...is numbers, int start) {} //will not compile
	//var args must be last param in param list
	
//	public void jump4(int... start, int... numbers) {} //also wont compile
	// can only have 1 var arg 
	
	public void jump5(int[] start, int[] numbers) {} //this will compile
	
	public static void jump(int start, int... numbers) {
		System.out.println("start= "+start+", numbers.length= "+numbers.length );
	}
	
	public static void run(int... numbers) {
		for (int number: numbers) {
			System.out.println(number);
		}
		
		System.out.println(Arrays.toString(numbers));
		
	}
	
	public static void main(String[] args) {
		jump(1);
		jump(2, 3);
		jump(4, 5, 6,7);
		jump(1, new int[] {4,5,6}); //redundant array creation
//		jump(1, null); //ok but get NullPointerException at runtime  
		
		//Note: var args = 0 or more
		
		run(); //compiles, prints []
		run(11, 22, 33, 44, 55, 66, 77, 88, 99);
		

	}

}
