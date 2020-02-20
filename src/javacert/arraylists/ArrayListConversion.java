package javacert.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConversion {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Tony");
		names.add("Jimmy");
		names.add("Anthony");
		
		Object[] namesArray = names.toArray(); //not what u usually want
		System.out.println(namesArray.length);
		
		String[] stringArray = names.toArray(new String[0]); //usu just specify size as zero
		
		String[] anotherStringArray = names.toArray(new String[names.size()]); //BETTER; will be same size now
		
		//now, array to list
		String[] petsArray = {"Dog", "Cat", "Parrot"};
		List<String> petsList = Arrays.asList(petsArray);

		//in 1 line:
//		List<String> petsList = Arrays.asList("dog", "cat", "parrot");
		//Note: returns fixed size list
		System.out.println(petsList.size()); //FIXED SIZE LIST
		
		petsList.set(0, "bird");
		System.out.println(petsList);
		System.out.println(Arrays.toString(petsArray)); //both are changed bc pointing to same thing
		
		petsArray[0] = "worms"; //same deal here
		System.out.println(petsList);
		System.out.println(Arrays.toString(petsArray));
		
//		petsList.add("Dog"); //runtime exception: UnsupportedOperationException
		//bc asList returns fixed size list
		
//		petsList.remove(1); //also runtime exception: UnsupportedOperationException
		
		// Takeaway: asList returns fixed size list, cant add or remove elements
		// (can change elements tho)
		
		List<String> list = Arrays.asList("1","2","3");
		System.out.println(list);
//		list.add("4"); //same deal
		
		
		
		
	}

}
