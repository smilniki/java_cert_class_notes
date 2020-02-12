package javacert.arrays;

import java.util.Arrays;

public class SearchingArrays {

	public static void main(String[] args) {
		// also easy to search arrays in java (using methods)
		
		int[] numbers = {1,3,5,6,7};
		System.out.println(Arrays.binarySearch(numbers, 2)); //-2
		System.out.println(Arrays.binarySearch(numbers, 5)); //2
		System.out.println(Arrays.binarySearch(numbers, 7));
		System.out.println(Arrays.binarySearch(numbers, 1));
		System.out.println(Arrays.binarySearch(numbers, 3));
		System.out.println(Arrays.binarySearch(numbers, 6));
		System.out.println(Arrays.binarySearch(numbers, 4)); //-3

		int[] notSortedNumbers = {5,4,10,8,6};
		System.out.println();
		
		// Get an unpredictable result:
		System.out.println(Arrays.binarySearch(notSortedNumbers, 5));
		System.out.println(Arrays.binarySearch(notSortedNumbers, 8)); //-3 O.o



	}

}
