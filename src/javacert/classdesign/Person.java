package javacert.classdesign;

public class Person {
	
	//this refers to own class
	
	private String firstName;
	private String lastName;
	
	public Person() {
		this("Eric", "Johnson");
	}
	
	public Person(String firstName, String last) {
//		this(); //having this here leads to compiler error
		
		this.firstName = firstName; //req here
//		String firstName = "wat"; //cant do this...wont compile
//		String lastName = "myName"; //can do this
		
		lastName = last;
	}
	
	// Note: this() can only show up in constructors
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName; //not req
	}
	
	public String getFullName() {
		return this.firstName+" "+this.lastName;
	}
	
	public static void main(String[] args) {
		
	}

}
