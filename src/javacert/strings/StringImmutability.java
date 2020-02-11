package javacert.strings;

public class StringImmutability {

	public static void main(String[] args) {
		String hello = "hello";
		
		// String class is immutable: when you create a string, there's no way to change it
		
		String hi = hello+"world"; //initialization not needed here //hi=helloworld
		hi = hello; //re-initialization //hi=hello 
		
		// 	WE'RE CHANGING THE REFERENCE THAT THE VAR IS POINTING TO, NOT THE STRING!!!!!!!
		 
		System.out.println(hi+hello); //hellohello
		
		hello.toUpperCase(); //returns new case
		System.out.println(hello); //hello
		
		hello = hello.toUpperCase(); //returns new case
		System.out.println(hello); //HELLO
		
		
		//concat
		String s1 = "1";
		String s2 = s1.concat("2"); //new string created
		s2.concat("3");
		
		System.out.println(s1); //1
		System.out.println(s2); //12
	}

}
