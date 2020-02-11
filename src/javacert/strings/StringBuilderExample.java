package javacert.strings;

public class StringBuilderExample {

	public static void main(String[] args) {
		String myString = "";
		
		for (char c='a';c<='z';c++) {
			myString+=c; //every iteration, new string object created
		}
		
		System.out.println(myString); //abcdefghijklmnopqrstuvwxyz
		
		//better to use StringBuilder (avoids creating all these new objects)
		//is mutable
		//~a container to build a string, and then call toString() to convert to string after
		StringBuilder sb = new StringBuilder();
		
		for (char c='a';c<='z';c++) {
			sb.append(c); //add char to StringBuilder; avoids creating new objects
		}
		System.out.println(sb); //abcdefghijklmnopqrstuvwxyz
		
		
		StringBuilder builder = new StringBuilder("start");
		builder.append("-middle"); //start-middle
		StringBuilder anotherBuilder = builder.append("-end");
		
		//both print start-middle-end 
		System.out.println(builder);
		System.out.println(anotherBuilder);
		
		System.out.println(builder==anotherBuilder); //true
		//same hashcodes:
		System.out.println(System.identityHashCode(builder));
		System.out.println(System.identityHashCode(anotherBuilder));

		//default capacity (amount of chars StringBuilder can hold) is 16
		// java automatically increases this if needed
		StringBuilder myBuilder = new StringBuilder();
		System.out.println("size= "+myBuilder.length());
		System.out.println("capacity= "+myBuilder.capacity());
		
		myBuilder = new StringBuilder(100); //assigning capacity to 100
		System.out.println("size= "+myBuilder.length());
		System.out.println("capacity= "+myBuilder.capacity()); //100
		
		myBuilder.append("MyNewTest");
		System.out.println("size= "+myBuilder.length()); //9
		System.out.println("capacity= "+myBuilder.capacity());
		
		StringBuilder a = new StringBuilder("This ");
		StringBuilder b = a.append("Java "); //we have 2 variables pointing to same object ref!
		b = b.append("is").append(" so ").append("Cool"); //so, changing b changes a
		System.out.println(a); //This Java is so Cool
		System.out.println(b); //This Java is so Cool
		 
	}

}
