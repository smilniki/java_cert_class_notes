package javacert.methods;

public class DogTester {

	public static void main(String[] args) {
		// Static methods used for:
		// 1. utility methods/helper methods that dont require any object state
		// 2. for state shared by all instances of a class (ex: counter)
		
		Dog husky = new Dog();
		
		System.out.println(husky.count);
		System.out.println(Dog.count);
		
		Dog anotherDog = new Dog();
		anotherDog.incrementCounter(); //get a warning bc calling static method from ref var
		Dog.incrementCounter();
		
		System.out.println(Dog.count); //get 0 0 2 
		
		husky = null;
		anotherDog = null;
		
		System.out.println(Dog.count);
		System.out.println(husky.count);
		System.out.println(anotherDog.count);
		//^ dont throw any excpetions!
		//static vars shared bw instances... 
		
		Dog.count = 10;
		Dog newDog = new Dog();
		Dog dog2 = new Dog();
		newDog.count = 5;
		newDog.count = 11;
	
		System.out.println(Dog.count); //11 
	}

}
