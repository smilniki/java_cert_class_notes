package javacert.strings;

public class StringMethods {

	public static void main(String[] args) {
		String str = "java is fun";
		
		System.out.println("length = "+str.length()); //11
		System.out.println(str.charAt(0)); //j
		System.out.println(str.charAt(2)); //v
		System.out.println(str.charAt(6)); //s
//		System.out.println(str.charAt(12)); //get exception at runtime
		
		System.out.println(str.indexOf('a')); //1
		System.out.println(str.indexOf('a', 2)); //start from index 2 //3
		System.out.println(str.indexOf("fun")); //8
		System.out.println(str.indexOf("fun", 10)); //-1 --> means match not found
		
		System.out.println(str.substring(8)); //fun
		System.out.println(str.substring(0,5)); //java_
		System.out.println(str.substring(4,4)); //nothing is printed (empty string)
//		System.out.println(str.substring(4,2)); //exception at runtime (out of range)
//		System.out.println(str.substring(8,14)); //same here
		
		System.out.println("aBcD".toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str); //str didnt change!
		
		String dog = "Lucky";
		dog = dog.toUpperCase();
		System.out.println(dog); //LUCKY
		
		
	}

}
