package javacert.arraylists;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods2 {

	public static void main(String[] args) {
		List<String> pets = new ArrayList<>();
		
		System.out.println(pets.isEmpty()); //true
		System.out.println(pets.size()); //0
		
		if (pets.isEmpty()) {
			System.out.println("No pets");
		}
		
		if (pets.size()==0) {
			System.out.println("No pets");
		}
		
		pets.add("cat");
		
		System.out.println(pets.isEmpty()); //false
		System.out.println(pets.size()); //1
		
		//clear removes all elements from list
		pets.clear();
		System.out.println(pets.isEmpty()); //true
		System.out.println(pets.size()); //0
		
		pets.add("dog");
		System.out.println(pets.contains("dog")); //true
		System.out.println(pets.contains("cat")); //false
		
		//.equals --> checks whether 2 objects contain same data
		//same elems but diff order --> lists arent equal tho
		
		List<String> newPets = new ArrayList<>();
		newPets.add("dog");
		System.out.println(pets.equals(newPets)); //true
		
		newPets.add("cat");
		System.out.println(pets.equals(newPets)); //false

		pets.add(0, "cat");
		System.out.println(pets);
		System.out.println(newPets);
		System.out.println(pets.equals(newPets)); //false; diff order

		
	}

}
