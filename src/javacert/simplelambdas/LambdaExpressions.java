package javacert.simplelambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressions {

	//functional programming in java since java 8
	//lambda sort of like anonymous method
	//called closures in some languages
	
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Fish", false, true));
		animals.add(new Animal("Rabbit", true, false));
		animals.add(new Animal("Dog", true, true));
		
//		print(animals, new CheckCanJump()); //worked before Predicate interface lecture; now comp issue
		
		//using lambda
		// Note: parameter type optional (but if you have it, surround in ())
		print(animals, animal -> animal.canSwim() );
		// if {} block used on RHS, need return & ;
		// Note: not required to specify a block w 1 statement
		// basically whatever you can do in a method you can do in a lambda
		
		
		Animal fish = animals.get(0);
		Animal rabbit = animals.get(1);
		Animal dog = animals.get(2);
		
		print(fish, rabbit, (first, second) -> first.canSwim() && second.canSwim());
		print(fish, dog, (first, second) -> first.canSwim() && second.canSwim());
		
		
		//Using built-in Predicate interface
		List<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Anthony");
		names.add("Jimmy");
		names.add("Timmy");
		
		System.out.println("names= "+names);
		
		//removeIf() method ... gotta remember for exam
		
		names.removeIf(name -> name.charAt(0)=='J'); //can use == since primitive
		
		System.out.println("after filter names= "+names);
		
	}
	
	//revised from below Using built-in Predicate interface:
	public static void print(List<Animal> animals, Predicate<Animal> filter) {
	for (Animal animal : animals) {
		if (filter.test(animal)) { //Predicate interface has method check
			System.out.println(animal.getType());
		}
	}
	System.out.println();
}
	
//	public static void print(List<Animal> animals, CheckAnimal filter) {
//		for (Animal animal : animals) {
//			if (filter.check(animal)) {
//				System.out.println(animal.getType());
//			}
//		}
//		System.out.println();
//	}
	
	public static void print(Animal first, Animal second, AnotherCheck check) {
		System.out.println(check.check(first, second));
	}
}

//Note: interfaces in java w 1 (non-static/default) method called functional interfaces
//lambdas work w these kinds of interfaces

//there is a built-in interface Predicate

interface CheckAnimal {
	boolean check(Animal animal);
}

interface AnotherCheck {
	boolean check(Animal first, Animal second);
}

class CheckCanJump implements CheckAnimal {
	@Override
	public boolean check(Animal animal) {
		return animal.canJump();
	}
}

class Animal {
	private String type;
	private boolean canJump;
	private boolean canSwim;
	public Animal(String type, boolean canJump, boolean canSwim) {
//		super();
		this.type = type;
		this.canJump = canJump;
		this.canSwim = canSwim;
	}
	public boolean canJump() {
		return canJump;
	}
	public boolean canSwim() {
		return canSwim;
	}
	public String getType() {
		return type;
	}
}
