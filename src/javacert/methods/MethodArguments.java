package javacert.methods;

public class MethodArguments {

	public static void main(String[] args) {
		// parameters = vars that appear in defn of method
		// args = actual values passed into method

	}
	
	int getZero() { //0 args/ niladic
		return 0; //wo return statement wont compile 
	}
	
	int increment(int number) { //1 arg/ monadic
		return number++;
	}
	
	int sum(int a, int b) { //2 args, diadic
		return a+b;
	}
	
	//3 arg methods make code hard to test apparently :O
	int plusMinus(int a, int b, int c) { //triadic
		return a +b - c;
	}
	
	double average(double a, double b, double c, double d) { //polyadic
		return ((a+b+c+d)/4.0);
	}
	
	//Note: try to avoid methods w 3+ args
	
//	void test {} //wont compile bc no brackets
	
//	void test(int a; int b) {} //wont compile (; instead of ,)
	
	void test(int a, int b) {} //good
	
//	void test2(int a); //missing method body, wont compile
	
	
	

	
	
}
