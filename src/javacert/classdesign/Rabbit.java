package javacert.classdesign;

public class Rabbit extends Animal implements Herbivore, Hop {
	
	@Override
	public void printDetails() {
//		System.out.println("Rabbit average jump height is "+getAverageJumpHeight());
		//^ wont compile bc trying to call method like its an instance method
		// but it's a static method... need to do:
		
		//compiles:
		System.out.println("Rabbit average jump height is "+Hop.getAverageJumpHeight());
	}
	
	public Rabbit() {
//		super; //wont compile bc this is not a statement
//		super().setAge(3); //also wont compile
		
//		super.setAge(3);
//		this.setAge(3); //these all do the same thing
//		setAge(3);
		
		super();
	}
	
	public Rabbit(int age) {
//		this(age); //compiler error bc recursion
//		super(); //calls parent cons w no args in animal class <--- musttt be first statement if used
//		this(); //calls cons w no args in this class
//		setAge(3);
		
		super(3); //just do this
	}
	
	@Override
	public int getWeight() {
		return 2;
	}
	
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		
	}
}
