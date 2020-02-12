package javacert.arrays;

public class CommonArrayProblems {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		
		for (int i=1;i<numbers.length;i++) { //skips first element
			System.out.println(numbers[i]);
		}
		
//		for (int i=1;i<=numbers.length;i++) { //runtime exception
//			System.out.println(numbers[i]);
//		}
		
//		int[20] nums; //wont compile
		int[] nums = new int[20]; //good
		
		//array size fixed/set at initialization! cant change it!
		
//		int size = numbers.length(); //wont compile, length is not a method
		int size = numbers.length; //good
		
//		numbers.length = 10; //wont compile
		

	}

}
