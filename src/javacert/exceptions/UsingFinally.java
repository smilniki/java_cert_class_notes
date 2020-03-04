package javacert.exceptions;

public class UsingFinally {

	//finally always executes
	
	public static void main(String[] args) {
		String[] array = new String[5]; //all 5 init to null bc String is Object
//		String element = firstToUppercase(array); //leads to nullPointerExcp at runtime
//		System.out.println("element= "+element);
		
		//need this order! ... or else code wont compile
		try {
			String element = firstToUppercase(array);
			System.out.println("element= "+element);
		} catch (NullPointerException e) {
			System.out.println("Error message= "+e.getMessage());
		} finally {
			System.out.println("Finally block");
		}
		
		//trick:
		String str = "";
		
		try {
			str += "a";
		} catch (Exception e) { //never executes
			str += "b";
		} finally {
			str += "c";
		}
		str += "d";
		
		System.out.println(str); //acd
		
	}
	
	public static String firstToUppercase(String[] array) {
		return array[0].toUpperCase();
	}
}
