package javacert.classdesign;

//commenting out methods below will lead to comp error bc parent class doesnt have no-arg cons
public abstract class Alligator extends Animal implements HasTail, CanRun {

	@Override
	public int getTailLength() {
		return 5;
	}
	
	public Alligator(int age) {
		super(age);
		System.out.println("Alligator");
//		this.age; //cant bc private
	}

	@Override
	public void eat() { //needs same signature/return type to be overriding...
		super.eat();
		System.out.println("Alligator eating");
	}
	
	//Note: can only override public + protected methods

	//compiler error bc method in parent class is/was final:
//	@Override
//	public double getAverageWeight() {
//		// TODO Auto-generated method stub
//		return super.getAverageWeight();
//	}
	
	@Override
	public double getAverageWeight() {
		return super.getAverageWeight()+20; //need super or else is recursive
	}
	
	
}
