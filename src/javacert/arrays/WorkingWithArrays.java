package javacert.arrays;

import java.util.Arrays;

public class WorkingWithArrays {

	public static void main(String[] args) {
		int[] one = new int[3]; //all 3 elements are init to 0 
		int[] two = new int[] {10,11,12}; //initialized w values
//		double[] d = new double[2.5]; //wont compile
		double[] d = new double[4*5/2]; //ok
		
		int x = 4;
		int y = 4;
		
		double[] c = new double[x*y]; //ok

		int[] three = {10,11,12}; //called an Anonymous array
		int[] four = {}; //is size zero; anonymous
		
		int[] a1;
		int[] a2;
		int a3[];
		int a4[];
		
		int[] ids, types; //creates 2 arrays
		int ids2[], types2; // BAD PRACTICE // creates array and int
		
		String[] animals = {"cat", "kitty"};
		String[] myAnimals = animals;
		String[] otherAnimals = {"cat", "kitty"};
		
		System.out.println(animals.equals(myAnimals)); //true
		System.out.println(animals==myAnimals); //true
		System.out.println(Arrays.equals(animals, myAnimals)); //true
		
		System.out.println(animals.equals(otherAnimals)); //false bc diff ref even though same elements
		System.out.println(animals == otherAnimals); //false not same ref
		System.out.println(Arrays.equals(animals, otherAnimals)); //true!
		
		//get hashcode:
		System.out.println(animals);
		System.out.println(animals.toString());
		
		System.out.println(Arrays.toString(animals)); //nice
	}

}
