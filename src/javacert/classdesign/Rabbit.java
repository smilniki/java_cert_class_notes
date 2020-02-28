package javacert.classdesign;

public class Rabbit extends Animal {
	
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
