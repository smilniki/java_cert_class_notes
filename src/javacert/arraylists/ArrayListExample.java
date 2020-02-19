package javacert.arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//only collection need to understand for this exam
		
		//can be thought of as a dynamic array ... will auto resize 
		ArrayList myList = new ArrayList(); //internally, uses array //default: array of objects
		ArrayList<Object> myList2 = new ArrayList<Object>();
		
		ArrayList<String> list = new ArrayList<String>(); //can only hold strings, no other objects
		ArrayList<String> list2 = new ArrayList<>(); //also valid since java 5 
		
		// List is an interface
		// here using interface as type of variable ... OK bc arraylist implements list 
		// ^ that is also known as POLYMORPHISM!!!!
		List<String> list3 = new ArrayList<>();
		
//		ArrayList<String> list4 = new List<>(); //wont compile //can't do "new interface"
		
		List<String> list5 = new ArrayList<String>(20); //can set initial capacity at start
 
	}

}
