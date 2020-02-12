package javacert.arrays;

public class ContinueStatement {

	public static void main(String[] args) {
		// continue statement --> exits current iteration of loop and moves onto next iteration
		
		String[] animals = {"dog", "cat", "lizard", "bird", "snake"};
		
//		for (String animal:animals) {
//			System.out.println(animal);
//		}
		
		System.out.println();
		
		MY_LOOP:
		for (String animal:animals) {
			if (animal.equals("cat")) {
				continue MY_LOOP;
			}
			System.out.println(animal);
		}
		
		System.out.println();
		
		animal: //label has same name as var; is confusing
			for (String animal:animals) {
				if (animal.equals("cat")) {
					continue animal;
				}
				System.out.println(animal);
			}
	
		System.out.println();
		
		//Without a label:
		for (String animal:animals) {
			if (animal.equals("cat")) {
				continue;
			}
			System.out.println(animal);
		}
		
		System.out.println();
		
//		int index = 0;
//		
//		//Infinite loop: (bc no index++)
//		while (index<animals.length) { 
//			String animal = animals[index];
//			if (animal.equals("lizard")) {
//				continue;
//			}
//			System.out.println(animal);
//			index++;
//			
//		}
		
		//Fix:
		int index = 0;
		while (index<animals.length) { 
			String animal = animals[index]; //this needs to be before next line or else get runtime error (out of bounds)
			index++;
			if (animal.equals("lizard")) {
				continue;
			}
			System.out.println(animal);
			
		}

	}

}
