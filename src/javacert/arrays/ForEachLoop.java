package javacert.arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		//aka enhanced for loop
		
		//avoids using indexing
		
		String[] names = {"Jimmy", "John", "Dom", "Andrew"};
		
		for (int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		for(String name:names) { //prints exactly the same
			System.out.println(name);
		}
		// Note: modifying local var wont affect actual array elements
		
		//see:
		for(String name:names) { //prints exactly the same
			name = name+"ahhh";
		}
		for(String name:names) { //prints exactly the same
			System.out.println(name);
		}
		
		StringBuilder[] builders = {
				new StringBuilder("For"),
				new StringBuilder("Loop")
		};
		
		for (StringBuilder builder:builders) {
			System.out.println(builder);
		}
		
		for (StringBuilder builder:builders) {
			builder.append("123"); //this actually appends to builders!
		}
		for (StringBuilder builder:builders) { //diff output!
			System.out.println(builder);
		}
		
		String pets = "Parrot";
//		for (String pet:pets) {}; //wont compile
		
//		for (int name: names) {}; //does not compile bc names contains Strings not ints
		
		for (char c : pets.toCharArray()) { //works!
			System.out.println(c);
		}
		
	}

}
