package javacert.arrays;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		// do w utility methods in Arrays class (needs to be imported)
		
		
		int[] numbers = {5,10,2};
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
		String[] strings = {"50", "9", "500"};
		Arrays.sort(strings);
		
		System.out.println(Arrays.deepToString(strings)); //[50, 500, 9] bc sorted alphabetically
		
		
	}

}
