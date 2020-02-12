package javacert.arrays;

import java.util.Arrays;

public class UsingArrays {

	public static void main(String[] args) {
		String[] pets = {"parrot", "cat", "dog"};
		
		System.out.println(pets[0]);
		System.out.println(pets[1]);
		System.out.println(pets[2]);
//		System.out.println(pets[3]); //runtime exception (ArrayIndexOutOfBoundsExcp)
		
		pets[0] = "bird";
		
		for (int i=0;i<pets.length;i++) {
			System.out.println(pets[i]);
		}
		
		for (int i=0;i<=pets.length-1;i++) {
			System.out.println(pets[i]);
		}
		
		System.out.println(Arrays.toString(pets)); //this method internally uses a StringBuilder
		
		int[] numbers = new int[5];
		System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0]
		
		String[] newPets = new String[5];
		System.out.println(Arrays.toString(newPets)); // [null, null, null, null, null]
		
		for (int i=0; i < numbers.length; i++) {
			numbers[i] = i + 10;
		}
		
		for (int i=0; i < numbers.length; i++) {
			System.out.println("numbers["+i+"]: "+numbers[i]);
		}
		
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
		
		Integer[] nums = new Integer[4];
		System.out.println(Arrays.toString(nums)); //[null, null, null, null]
		
		for (int i=0; i < nums.length; i++) {
			nums[i] = i % 3;
		}
		
		System.out.println(Arrays.toString(nums)); //[0, 1, 2, 0]
		
	}

}
