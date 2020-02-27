package javacert.methods;

public class PassingDataBetweenMethods {

	public static void newNumber(int number) { //number param = a copy
		System.out.println("in newNumber, number= "+number);
		number = 10; //setting COPY/parameter to 10
		System.out.println("in newNumber, number= "+number);
		
		String name = "Jimmy";
		System.out.println("name= "+name);
		newName(name);
		System.out.println("name= "+name);
		
		StringBuilder sb = new StringBuilder();
		
		build(sb);
		System.out.println("stringBuilder= "+sb); //prints Bob!
		//bc: b param is copy of sb, and both refs point to same StringBuilder in memory
		//so changes made to StringBuilder avail to both refs
		
		StringBuilder s = sb; //both point to same object now
		s.append("Anthony");
		
		System.out.println(s); //BobAnthony
		System.out.println(sb); //BobAnthony
	}
	
	public static void newName(String name) {
		System.out.println("in newName, name= "+name);
		name = "Susan";
		System.out.println("in newName, name= "+name);
	}
	
	public static void build(StringBuilder b) {
//		b = new StringBuilder(); //with this here, line 18 prints stringBuilder= (no Bob)
		b.append("Bob");
	}
	
	public static void main(String[] args) {
		//Note: java is a pass-by-value language
		//meaning, a copy of the var is made and the method receives that copy
		
		int number = 4;
		System.out.println("number= "+number);
//		newNumber(5); //passing copy of 5
		newNumber(number);
		System.out.println("number= "+number);

	}

}
