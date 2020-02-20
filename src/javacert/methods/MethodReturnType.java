package javacert.methods;

public class MethodReturnType {

	public void jump() {}
	
	public void jump2() {return; } //redundant return statement
	
	public String jump3() {
		return "";
	}
	
//	public String jump4() { //comp error bc no return statement
//		
//	}
	
//	public jump5() {} //wont compile bc no return type specified
	
//	String jump6(int a) { //wont compile bc doesnt return in any case
//		if (a==5) {
//			return "hi";
//		}
//	}
	
	String jump6(int a) { //good
		if (a==5) {
			return "hi";
		}
	return "bye";
	}
	
	int getInt() {
		return 9;
	}
	
//	int getLong() { //wont compile bc long isnt autoconverted to int
//		return 9l;
//	}
//	
	
	int getLong() { //fix
		return (int)9l;
	}
	
	int expanded() {
		int temp = 10;
		return temp;
	}
	
	boolean isTrue() { //ok
		return 5<10;
	}
	
	boolean isTrue2() { //ok aswell
		return 5==5;
	}
	
	public void test() {}
	
//	public void 2test( ) {} //wont compile
	
//	public void void() {} //wont compile, no keywords for method names
	
	public void $test() {} //good
	public void _test() {} //good
	
	
	

	
}
