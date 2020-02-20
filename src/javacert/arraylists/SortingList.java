package javacert.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		 List<String> numsList = new ArrayList<>();
		 numsList.add("500");
		 numsList.add("10");
		 numsList.add("9");
		 numsList.add("50");
		 numsList.add("40");

		 System.out.println(numsList); //printed in same order inserted elems
		 
		 //to sort: call utility method in Collections class
		 Collections.sort(numsList);
		 System.out.println(numsList); //sorted alphabetically bc strings
		 
		 List<Integer> numbers = Arrays.asList(5,4,7,8,9,10,3,2);
		 System.out.println(numbers); //order same as above
		 Collections.sort(numbers);
		 System.out.println(numbers); //sorted numerically
	}

}
