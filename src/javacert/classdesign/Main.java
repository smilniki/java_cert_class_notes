package javacert.classdesign;

public class Main {

	// Object class is parent class of all 
	
	public static void main(String[] args) {
		SiberianAlligator siberianAlligator = new SiberianAlligator(5);
//		Animal
//		Alligator
//		Siberian Alligator
		//...we DID instantiate all 3 bc "is a"
		// Recall: order of init --> parent class called first
		
		//Note: every constructor has super...the compiler generates it. Can't see it tho
		
		siberianAlligator.getDetails();
		
//		Alligator alligator = new Alligator(3); //cant instantiate anymore bc abstract
//		alligator.setName("rex");
//		alligator.printDetails(); //cant use here when only in SiberianAlligator class...
//		alligator.printDetails(); //can use now since its in animal class (parent class)
		
		siberianAlligator.eat();
//		Animal is eating
//		Alligator eating
//		Siberian Alligator eating
		
		System.out.println("average= "+siberianAlligator.getAverageWeight()); //30
		
		
		// ... up to abstract lecture now...
		
//		Animal animal = new Animal(); //wont compile bc Animal is abstract
		
		siberianAlligator.setName("tony");
		siberianAlligator.setAge(6);
		siberianAlligator.printName();
		System.out.println("weight= "+siberianAlligator.getWeight());
		
		
	}
}
