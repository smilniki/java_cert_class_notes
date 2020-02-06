package javacert.basics;

public class PrimitivesCharAndBoolean {

	public static void main(String[] args) {
		char ch = 'a';
		char ch1 = '1';
		
		char uniChar = '\u03A9'; //uppercase greek omega char
		char romanNumber = '\u216C'; //roman 50 char
		
		System.out.println("uniChar: "+uniChar);
		System.out.println("romanNumber: "+romanNumber);

		boolean myBoolean = true;
		boolean myFalseBoolean = false;
		
		System.out.println("myBoolean: "+myBoolean);
		System.out.println("myFalseBoolean: "+myFalseBoolean);
	}

}
