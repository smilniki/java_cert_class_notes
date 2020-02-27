package javacert.methods;

public class Static {

	private String name = "Static";
	
	public static void one() {}
	public static void two() {}
	public static void three() {
		one();
		two();
//		four(); //cant call four() bc it isnt a static method
//		System.out.println(name); //cant bc this field isnt static
		//Important rule: cant ref/call non-static members from static context
		
		
	
	}
	
	public void four() {
		one();
		two();
		three();
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Static.one(); //ok
		one(); //ok bc in same class
		two();
		three();
//		four(); //comp error bc not static
		
		Static myInstance = new Static();
		myInstance.four(); //this will work now
		
		new Static().four();
		
		//Important Rule: static methods can only call other static methods directly
		
		//instance methods can call static and instance methods
		
		 
	}
	
	
}
