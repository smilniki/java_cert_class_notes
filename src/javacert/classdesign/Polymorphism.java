package javacert.classdesign;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {

	public static void main(String[] args) {
		// java object can be referenced w same type as object, or a superclass of it
		// or, ref that defines an interface the object implements (either directly or indirectly)
		
		SiberianAlligator siberianAlligator = new SiberianAlligator(5);
		siberianAlligator.setName("Rex");
		
		//called upcasting
		Alligator alligator = siberianAlligator; //another ref to sibAll obj in memory
		
		alligator.printDetails();
		
		//can also assign to interface
		HasTail hasTail = siberianAlligator; //another ref to same obj
		System.out.println("Tail length is "+hasTail.getTailLength()); //this method now available
		
		CanRun canRun = siberianAlligator; //another ref to same obj
		canRun.run(5);
		
		Animal animal = siberianAlligator; //another ref to same obj
		animal.printDetails();
		
		Animal cat = new Kitty(2); //ok
//		Kitty myCat = cat; //wont compile
		Kitty myCat = (Kitty)cat; //fix: casting
		
		((Kitty) cat).getSpeed();
		myCat.getSpeed();
		
		Object object = siberianAlligator; //another ref to same obj
		animal.printName();
		
		// Note: in java, objects are only evered accessed by reference
		// NEVER have direct access to object itself
		
//		Bear bear = new (Bear)"test"; //wont compile bc not related in heirarchy
		
		Alligator all = (Alligator)cat; //will compile but get runtime exception (class cast exception)
		
		//Note: class is polymorphic when it can be assigned to more than 2 types (more than itself and object)
		
		//ex: 3 types of refs pointing to same object in memory
		Eagle eagle = new Eagle();
		Bird eagleBird = eagle;
		Object eagleObject = eagle;
		
		List<String> list = new ArrayList<String>();
		
	}

}
