package javacert.basics;

public class DecimalNumericPrimitives {

	public static void main(String[] args) {
		float myNumber = 25.4F;
		
//		double before = 10_.25; //doesn't compile
//		double after = 10._25; //same ''
//		also can't do directly before or after, like in whole numeric primitives
		
		double myDouble = 2.54;
		double myDouble2 = 2.54F; //autoconversion happens
		
		double anotherDouble = 2.45d;
		
		double scientific = 5.000123e03; //this is legal
		double scientific2 = 5.000123e3; //this is also legal
		double myDouble3 = 5000.123;

//		these will all print the same thing
		System.out.println("scientific = "+scientific);
		System.out.println("scientific2 = "+scientific2);
		System.out.println("myDouble3 = "+myDouble3);
	
		double hexPi = 0x1.91eb851eb851fp1; //p indicates hexadecimal floating point number
		System.out.println("hexPi = "+hexPi); //prints 3.14
	}

}
