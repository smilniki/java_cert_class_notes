package javacert.arrays;

public class BreakStatement {

	public static void main(String[] args) {
		//when using breaks, can provide an optional label: to indicate head loop
		//when using break, do break optionalLabel;
		//are not good practice but can be handy sometimes
		
//		myLabel:
//		int[] myArray = {1,2,3}; //wont work; cant have a label on var declaration
		
		myLabel: //works but bad bc you cant use myArray outside block
		{
			int[] myArray = {1,2,3}; 
		}
	
		String[] animals = {"dog", "cat", "lizard", "bird", "snake"};
		for (String animal: animals) {
			System.out.println(animal);
		}

		System.out.println();
		
		MY_LOOP: for (String animal: animals) { //will only print dog
			if (animal.equals("cat")) {
				break MY_LOOP;
			}
			System.out.println(animal);
		}
		
		animal: for (String animal: animals) { //works but confusing to read
			if (animal.equals("cat")) {
				break animal;
			} 
			System.out.println(animal);
		}
		
		for (String animal: animals) { //break will always break the first loop
			if (animal.equals("lizard")) {
				break;
			}
			System.out.println(animal);
		}
		
		int index = 0;
		while (index<animals.length) { //works the same as above
			String animal = animals[index];
			if (animal.equals("lizard")) {
				break;
			}
			System.out.println(animal);
			index++;
		}
		
	}

}
