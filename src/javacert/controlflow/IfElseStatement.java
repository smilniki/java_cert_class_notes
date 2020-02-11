package javacert.controlflow;

public class IfElseStatement {

	public static void main(String[] args) {
		boolean b = true;
		
		if (b) { //this expr needs to be a boolean
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		
		int x = 1;
		if (x==1) {
			
		}
		
		int testScore=76;
		char grade;
		
		if (testScore>=90) {
			grade = 'A';
		} else if (testScore>=80) {
			grade = 'B';
		} else if (testScore>=70) {
			grade = 'C';
		} else if (testScore>=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("grade= "+grade);
		
		int hourOfDay = 10;
		if (hourOfDay<11) System.out.println("Morning");
		else if (hourOfDay<17) System.out.println("Evening");
		else
			System.out.println("Day"); // else statement will only have this 1 line
			hourOfDay++; //this wont be executed
		
		if (hourOfDay<17) {
			System.out.println("Afternoon");
		} else if (hourOfDay<11) { //never executes
			System.out.println("Morning");
		} else {
			System.out.println("Evening");
		}
	}

}
