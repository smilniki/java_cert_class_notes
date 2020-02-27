package javacert.classdesign;

public class DataEncapsulation {

	// POJO = plain old java object .. just a normal class w data encapsulation
	// follows conventions in code
	
	public static void main(String[] args) {
		Company company = new Company();
//		company.name = "myCompany"; //ok at first bc public
//		company.employees.add("john");
//		company.employees.add("anthony");
//		
//		company.printSorted();
//		
////		company.name = null;
////		company.printSorted();
//		
//		company.employees = null;
//		company.employees.add("jimmy"); //NullPointerExc at runtime
//		company.printSorted(); //also get NullPointer here ...cant sort a null list
		
		// Idea behind data encapsulation: hide details of implementation from users
		// aka data hiding
		// improves re-usability of underlying code
		// implementation hidden
		
		company.setName("myCompany");
		company.addEmployee("john");
		company.addEmployee("anthony");
		company.addEmployee(null);
		
		company.printSorted(); //NullPointer bc Collections.sort cannot sort list w null in it
		
		
		//presence/absense of getters/setters --> lead to read or write-only fields

	}

}
