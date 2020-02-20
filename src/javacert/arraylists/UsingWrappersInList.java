package javacert.arraylists;

import java.util.ArrayList;
import java.util.List;

public class UsingWrappersInList {

	public static void main(String[] args) {
		// 	CANT ADD PRIMITIVES TO LIST
		
//		List<double> doubleList = new ArrayList<>(); //wont compile; double isnt an object
		List<Double> doubleList = new ArrayList<>();
		
		doubleList.add(10.5); //autoboxing 
		doubleList.add(new Double(55.5)); 
		doubleList.remove(55.5); //autoboxing again
		
		double first = doubleList.get(0); //unboxing...going from ref to primitive
		
		System.out.println(doubleList);
		System.out.println(first);
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(null);
		
		System.out.println(numbers);
		
//		int number = numbers.get(0); //NullPointerException at runtime...primitives cant hold null
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1); //autoboxing //index 0
		nums.add(2); //index 1
		nums.remove(1);
		
		System.out.println(nums);
		
		//diff result
		nums.remove(new Integer(1));
		System.out.println(nums);
		
		//Takeaway: they like to call remove with remove(index) 
	}

}
