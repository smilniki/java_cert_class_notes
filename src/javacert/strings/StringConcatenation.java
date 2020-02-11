package javacert.strings;

public class StringConcatenation {

	public static void main(String[] args) {
		//String is a special class that doesnt need keyword "new" to create
		
		String text = "hello";
		String anotherText = new String("hello");
		
		// + op bw 2 numbers --> numeric addition
		// if >=1 operant is a string --> it's concatenation
		// eval from left to right
		
		System.out.println(2+3); //5
		System.out.println("a"+"b"); //ab
		System.out.println(1+2+"d"); //3d
		
		int three = 3;
		String four = "4";
		System.out.println(1+2+three+four); //3+3+"4" //6+"4" //64
		
		int number = 10;
		int anotherNumber = 20;
		System.out.println("result= "+number+anotherNumber); //result= 1020
		
		String str = "";
		for (int i=0;i<10;i++) {
			str += i; //Note: everytime we concat 2 strings, we're creating a new one!
		}
		
		System.out.println(str); //0123456789
		
		String hello = "hello";
		String world = "world";
		String helloWorld = hello+world; //new string created!
//		hello+world; //wont compile
		
		System.out.println(hello); //hello
		
		
	}

}
