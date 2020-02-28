package javacert.classdesign;

public class Eagle extends Bird{
	
	public int fly(int height) { //this is OVERLOADING from parent class
		System.out.println("eagle is flying at "+height+" km");
		return height;
	}
	
	@Override
	public void eat(int amount) { //this is OVERRIDING
		
	}
	
	//Note: on exam, when you see method in super class w same name as child class,
	// check if its overloaded or overriden!
	
}
