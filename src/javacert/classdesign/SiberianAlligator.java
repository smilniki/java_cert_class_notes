package javacert.classdesign;

public class SiberianAlligator extends Alligator{
	
	public SiberianAlligator(int age) {
//		super(); //calls constuctor in parent class //is auto-generated for us
		super(age); //if this removed, have comp error bc no default constructor in parent
		System.out.println("Siberian Alligator");
	}

}
