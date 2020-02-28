package javacert.classdesign;

public class SiberianAlligator extends Alligator{
	
	public SiberianAlligator(int age) {
//		super(); //calls constuctor in parent class //is auto-generated for us
		super(age); //if this removed, have comp error bc no default constructor in parent
		System.out.println("Siberian Alligator");
	
	}
	
	public void getDetails() {
		System.out.println("name= "+getName()+", age= "+getAge());
	}

	@Override
	public void eat() {
		super.eat(); //dont need this
		System.out.println("Siberian Alligator eating");
		
		super.eat(); //this can be here!
	}
	
	//Note: cant override final methods ... sort of by defn
	
	//all abstract methods from parent, grandparent, etc need to be imp now
	@Override
	public int getWeight() {
		return 5;
	}
	
	@Override
	public void printName() {
		System.out.println("Siberian alligator name= "+getName());
	}
}
