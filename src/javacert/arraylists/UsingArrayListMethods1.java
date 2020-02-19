package javacert.arraylists;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods1 {

	public static void main(String[] args) {
		List list = new ArrayList(); //no type--> same as declaring List<Object> ...
		list.add("Dog");
		list.add(5);
		
		System.out.println(list); //toString auto-called by println
		//Note: different than what happens with arrays
		
		 List<String> pets = new ArrayList<String>();
		 pets.add("Dog");
		 System.out.println(pets);
		 
		 pets.add(0, "Cat"); //can specify index
		 System.out.println(pets);
		 
//		 pets.add(5); //compilation error bc cant add an int
		 
		 pets.add(1, "Parrot");
		 System.out.println(pets);
		 pets.add(0, "Lizard");
		 System.out.println(pets);
		 pets.add(1, "Birdy");
		 System.out.println(pets);
		 
		 //remove
		 pets.remove("Parrot");
		 System.out.println(pets);
		 
		 pets.remove(2);
		 System.out.println(pets);
		 
		 pets.set(0, "NewBird"); //changes the element at pos 0
		 System.out.println(pets);
		 
		 pets.set(6, "Cats"); // Runtime exception (IndexOutOfBounds)
	}

}
