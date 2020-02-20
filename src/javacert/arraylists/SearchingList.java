package javacert.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchingList {

	public static void main(String[] args) {
		//tldr same deal as w arrays
		// list must be sorted to get proper result

		List<String> numsList = new ArrayList<>();
		 numsList.add("500");
		 numsList.add("10");
		 numsList.add("9");
		 numsList.add("50");
		 numsList.add("40");
		 
		 System.out.println(numsList);
		 
		 int index = Collections.binarySearch(numsList, "10");
		 System.out.println(index); //-1... nonsensical result bc list not sorted
		 
		 Collections.sort(numsList);
		 System.out.println(numsList);
		 index = Collections.binarySearch(numsList, "10");
		 System.out.println(index); //0 ...yup
		 
		 List<Integer> numbers = Arrays.asList(5,4,7,8,9,10,3,2);
		 System.out.println(numbers);
		 index = Collections.binarySearch(numbers, 7);
		 System.out.println(index); //once again...nonsensical
		 
		 Collections.sort(numbers);
		 System.out.println(numbers);
		 index = Collections.binarySearch(numbers, 7);
		 System.out.println(index); //good
		 
	}

}
