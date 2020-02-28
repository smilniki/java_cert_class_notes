package javacert.classdesign;

public abstract class Animal {

	private int age;
	protected String name;
	
	public Animal() {}
	
	public Animal(int age) {
		System.out.println("Animal");
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//good idea to put this here bc not available to all child classes
	public void printDetails() {
		printName();
		System.out.println("age= "+age);
	}
	
	//will still work in Main bc thats in the same package ... wont work if Main moved to another package
//	protected void printDetails() {
//		System.out.println("name= "+name+", age= "+age);
//	}

	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public double getAverageWeight() {
		return 10.0;
	}
	
	//wont compile bc a method cant be static and abstract
//	public static abstract void run() {
//		
//	}
	
//	public abstract void run() {} //wont compile bc has a body technically
	
	public abstract int getWeight(); //now, abstract method need to be imp in every child class
	
	public abstract void printName();
	
}
