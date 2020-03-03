package javacert.classdesign;

public class PolyParameters {

	public static void main(String[] args) {
		SiberianAlligator siberianAlligator = new SiberianAlligator(3);
//		siberianAlligator.printDetails();
		siberianAlligator.setName("rex");
		printDetails(siberianAlligator);
		
		Rabbit rabbit = new Rabbit();
		rabbit.setName("bunny");
		printDetails(rabbit);

		Kitty kitty = new Kitty(2);
		kitty.setName("tom");
		printDetails(kitty);
		
		Animal rex = createAnimal("rex", 4);
		printDetails(rex);
		
		Animal kitty2 = createAnimal("kitty", 3);
		printDetails(kitty2);
		
		Animal bunny = createAnimal("bunny", 2);
		printDetails(bunny);
	}
	
	//polymorphic parameters & return type!
	
//	public static void printDetails(SiberianAlligator siberianAlligator) {
//		siberianAlligator.printDetails();
//	}
//	
//	public static void printDetails(Rabbit rabbit) {
//		rabbit.printDetails();
//	}
	
	//replace w one method .. no need for duplicate code
	public static void printDetails(Animal animal) {
		animal.printDetails();
	}
	
	public static Animal createAnimal(String name, int age) {
		if (name.equals("rex")) {
			Animal animal = new SiberianAlligator(age); //animal is instance of sib all in memory
			animal.setName(name);
			return animal;
		} 
		else if (name.contentEquals("kitty")) {
			Kitty kitty = new Kitty(age);
			kitty.setName(name);
			return kitty;
		}
		Animal rabbit = new Rabbit(age);
		rabbit.setName(name);
		return rabbit;
	}
	

}
