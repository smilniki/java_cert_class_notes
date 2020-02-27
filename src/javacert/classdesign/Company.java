package javacert.classdesign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

//	public String name;
//	public List<String> employees = new ArrayList<String>();
	
	private String name;
	private List<String> employees = new ArrayList<String>();
	
//	public Company() {}
	
	public void printSorted() {
		System.out.println("Company name= "+name);
		Collections.sort(employees);
		System.out.println("sorted= "+employees);
	}
	
	public void setName(String name) {
		if (name==null || name.isEmpty()) {
			System.out.println("name cant be null");
			return; //need this here
		}
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addEmployee(String name) {
		if (name==null) {
			System.out.println("cant add null employee");
			return; //need this here
		}
		employees.add(name);
	}
	
}
