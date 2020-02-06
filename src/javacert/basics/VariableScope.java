package javacert.basics;

public class VariableScope {

	static int myNewInt = 5; //global var
	
	public static void main(String[] args) {
//		each code block has its own scope
//		blocks can be nested
//		cant have 2 vars w same name in same scope
		
		int myLocalInt = 10;
		
		{
			int myOtherInt = 15; //only available inside this code block
			System.out.println("myOtherInt: "+myOtherInt);
			System.out.println("In code block myLocalInt: "+myLocalInt);
		}
		
//		System.out.println("myOtherInt: "+myOtherInt); //compilation error
		
		System.out.println("myLocalInt: "+myLocalInt);
		System.out.println("myNewInt: "+myNewInt);

		int myOtherInt = 30;
		System.out.println("myOtherInt: "+myOtherInt);
		
	}
	
	public static void myMethod() {
		
	}

}
