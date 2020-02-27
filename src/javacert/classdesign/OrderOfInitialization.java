package javacert.classdesign;

class Example {
	private String name = "dog";
	
	{
		System.out.println(name);
	}
	
	private static int COUNT = 0;
	
	static {
		System.out.println(COUNT);
	}
	
	{
		COUNT += 10;
		System.out.println(COUNT);
	}
	
	public Example() {
		System.out.println("constructor");
	}
}

class Demo {
	
	static {
		add(2);
	}
	
	static void add(int number) {
		System.out.println(number+" ");
	}
	
	Demo() {
		add(5);
	}
	
	static {
		add(4);
	}
	
	{
		add(6);
	}
	
	static {
		new Demo();
	}
	
	{
		add(8);
	}
}

public class OrderOfInitialization {

	//instance initializer is a code block wo keyword static
	//is called before constructor
	
	public static void main(String[] args) {
		Example example = new Example();
//		0
//		dog
//		10
//		constructor		
		
		//Rule: static first, then instance, then constructor last

		new Demo();
//		2 
//		4 
//		6 //this bc when Demo() called (a constructor), before that instance must be called
//		8 
//		5 
//		6 // 6 8 5 again bc of line 71 constructor being called
//		8 
//		5 
		

	}

}
