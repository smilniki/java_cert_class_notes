package javacert.classdesign;

class Dog3 {
	private String name;
	private String breed;
	private double weight;
	
	//problem: avoiding duplicate code
	// solution: Constructor chaining
	
	public Dog3(String name) {
//		this.name = name;
//		breed = "Husky";
//		weight = 13.0;
		
//		Dog3(name, "Husky"); //wont compile
		
//		new Dog(name, "Husky"); //will compile but not what we want
		
		this(name, "Husky"); //this is a method that calls a diff constructor
		// Rule: this call must be first non-comment line in method
		
		System.out.println("constructor 1");
	}
	
	public Dog3(String name, String breed) {
//		this.name = name;
//		this.breed = breed;
//		weight = 13.0;
		
		this(name, breed, 13.0);
		System.out.println("constructor 2");
	}
	
	//last constructor "does all the work"
	public Dog3(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
		System.out.println("constructor 3");
	}
	
	public void print() {
		System.out.println("name= "+name+", breed="+breed+", weight="+weight);
	}
	
}

public class OverloadingConstructors {
	public static void main(String[] args) {
		Dog3 dog1 = new Dog3("jimmy"); //1st cons called
		dog1.print();
		
		Dog3 dog2 = new Dog3("tony", "shepard"); //2nd cons called
		dog2.print();
		
		Dog3 dog3 = new Dog3("rex", "german shep", 40); //3rd cons called
		dog3.print();
		
		
	}
}
