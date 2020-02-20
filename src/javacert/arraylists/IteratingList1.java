package javacert.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList1 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);

		for (int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
//			numbers.remove(2); //leads to runtime error (IndexOutOfBounds)
		}
		
		for (Integer number : numbers) {
			System.out.println("number= "+number);
//			numbers.remove(2); //ConcurrentModificationException at runtime
			//deal is: can't modify list as youre iterating through it
		}
		
		//ListIterator is like iterator except more options (backwards, etc)
		
		//type of iterator is same as type of list
		for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
			Integer number = iterator.next(); //get the item
			System.out.println(number);
			iterator.remove(); //removes current item(what got from next)
		}
		System.out.println(numbers);
		
		numbers.addAll(Arrays.asList(1,2,3,4,5,6)); //addAll requires a collection passed in
		
		//now, listIterator
		//starting at index 3
		for (ListIterator<Integer> listIterator = numbers.listIterator(3);listIterator.hasPrevious(); ) {
			System.out.println(listIterator.previous()); //1.prev elem from index 3 is index 2
			listIterator.remove(); //again, removes current elem
		}
		
	}

}
