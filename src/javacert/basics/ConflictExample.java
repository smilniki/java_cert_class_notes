package javacert.basics;

import java.util.List;

public class ConflictExample {

//	packages --> don't need unique class names across entire program

	public static void main(String[] args) {
		// if full paths specified, don't need to import
		java.util.Date date;
		java.sql.Date sql;
	}

	// Format in eclipse using Cmd+Shift+f
	
	public void checkEmpty(List list) {
		if (list.isEmpty()) {
			System.out.println("List is empty");
		} else {
			System.out.println("List is not empty");
		}
	}

}
