package javacert.methods;

public class Launcher {

	public static void main(String[] args) {
		StaticMethodsAndFields.main(args); //ok
		
		System.out.println(StaticMethodsAndFields.myNumber); //ok
		
		AnotherMain.main(args); //ok
		
		// The point: main method can be called just like any other static method

	}

}
