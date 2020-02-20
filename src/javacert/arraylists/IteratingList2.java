package javacert.arraylists;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList2 {

	public static void main(String[] args) {
		//small performance test for diff iterators
		
		List<String> list = Arrays.asList(createArray());
		
		//for loop
		long startTime = System.currentTimeMillis();
		
		for (int i=0;i<list.size();i++) {
			String temp = list.get(i);
		}
		
		long totalTime = System.currentTimeMillis()-startTime;
		
		System.out.println("For loop total time: "+totalTime+"ms");
		
		
		//foreach
		startTime = System.currentTimeMillis();
		
		for (String temp : list) {
			
		}
		
		totalTime = System.currentTimeMillis()-startTime;
		
		System.out.println("Foreach loop total time: "+totalTime+"ms");
		
		
		//iterator
		startTime = System.currentTimeMillis();
				
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
			String temp = iterator.next();
		}
				
		totalTime = System.currentTimeMillis()-startTime;
				
		System.out.println("Iterator loop total time: "+totalTime+"ms");
		
		//listiterator
		startTime = System.currentTimeMillis();
				
		for (ListIterator<String> iterator = list.listIterator(); iterator.hasNext(); ) {
			String temp = iterator.next();
		}
				
		totalTime = System.currentTimeMillis()-startTime;
				
		System.out.println("ListIterator loop total time: "+totalTime+"ms");

		//when for code is compiled, its turned into something using iterator :O
	}
	
	private static String[] createArray() {
		String[] stringArray = new String[100_000_000];
		
		for (int i =0;i<stringArray.length;i++) {
			 stringArray[i] = "Array"+i;
		}
		return stringArray;
	}

}
