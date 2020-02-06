package javacert.basics;

public class WrapperTypes {

	public static void main(String[] args) {
		int myInt = 10;
		Integer myInteger = new Integer(10); // boxing -- putting primitive value inside wrapper
		Integer myInteger2 = 20; //autoboxing -- compiler automatically converts to Integer
		Integer myInteger3 = Integer.valueOf(10);
		Integer myInteger4 = Integer.parseInt("3");
		Integer myInteger5 = null;
		
//		int myInt = null; //wont compile
		
		System.out.println("myInteger: "+myInteger);
		System.out.println("myInteger2: "+myInteger2);
		System.out.println("myInteger3: "+myInteger3);
		System.out.println("myInteger4: "+myInteger4);
		System.out.println("myInteger5: "+myInteger5);
		
		//unboxing -- Integer to int, for ex: (Wrapper to primitive)
		int myInt3 = myInteger3; 
		
		//boxing:
		Integer myInteger6 = new Integer(10); //is unnecesary, though
		
		Integer myInteger7 = myInt;
		
//		int myInt5 = myInteger5; //get a warning since primitives can't contain null // get NullPointer at runtime
		
		printSum(1, 5); // ok bc autoboxing
		printSum(myInteger, myInteger2);
	}
	
	private static void printSum(Integer first, Integer second) {
		System.out.println("sum = "+ (first+second));
	}

}
