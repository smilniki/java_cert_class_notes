package javacert.operators;

public class CharacterArithmetic {

	public static void main(String[] args) {
		// char is 0 - 65535
		char myCharA = 'A';
		char myCharNum = '1';
		
		System.out.println("myCharA= "+myCharA);
		System.out.println("myCharA is letter= "+Character.isLetter(myCharA)); //true
		System.out.println("myCharA is digit= "+Character.isDigit(myCharA)); //false

		System.out.println("myCharNum= "+myCharNum);
		System.out.println("myCharNum is letter= "+Character.isLetter(myCharNum)); //false
		System.out.println("myCharNum is digit= "+Character.isDigit(myCharNum)); //true
	
		// exam Q examples
		char letter = 65; //A
		int myInt = letter+3;
		char myNewLetter = (char)myInt;
		
		System.out.println("letter: "+letter); //A
		System.out.println("myInt: "+myInt); //68
		System.out.println("myNewLetter: "+myNewLetter); //D
		
		char myChar = 65; //A
		char newChar = (char)(myChar+1); //need to cast or else get comp error //B
		boolean b = newChar == 'B'; //true
		boolean c = newChar++ == 'C'; //false
		
		System.out.println("myChar: "+myChar);
		System.out.println("newChar: "+newChar);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		
	}

}
