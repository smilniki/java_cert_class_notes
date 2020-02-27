package javacert.classdesign;

class Dog {
	
	private String color;
	
	public Dog(String color) { //Note: no return type
		System.out.println("Construtor");
//		color = color; //not good 
		this.color = color; //this refers to current class
		//this is only req when we have param of same name
		
	}
	
	public void printColor() {
		System.out.println("color= "+this.color); //this not needed here
	}
	
//	public void Dog() {} //will compile but it's not a constructor bc it has a return type
	
//	public dog() {} //wont compile
}

class Cat {
	private String color;
	private int height;
	private int length;
	
	public Cat(int length, int theHeight) {
//		length = this.length; //noooo but will compile
		this.length = length;
		height = theHeight;
		color = "white";
	
	}
	
	public void printInfo() {
		//this is optional below
		System.out.println("cat length= "+this.length+", height= "+this.height+" , color="+this.color);;
	}
	
}

public class ClassConstructors {

	// Note: multiple java classes can be in same file, but only 1 public class allowed
	
	public static void main(String[] args) {
		Dog dog = new Dog("black");
		dog.printColor();
		
		Cat cat = new Cat(10, 12);
		cat.printInfo();
	}

}
