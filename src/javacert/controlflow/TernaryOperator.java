package javacert.controlflow;

public class TernaryOperator {

	public static void main(String[] args) {
		 int x = 10;
		 int y;
		 
		 if (x>5) y = 2*x;
		 else y = 4*x;

		 System.out.println("y= "+y);
	
		 //ternary op
		 // y = x>5 ? 2*x : 4*x
		 y = (x>5) ? (2*x) : (4*x);
		 System.out.println("y= "+y);
		 
		 y = 1;
		 //not same data type example
		 System.out.println(y > 5 ? 10: "Test");
//		 int myInt = y > 5 ? 10: "Test"; //wont compile
		 
		 // Note: ternary operator works like short-circuit op
		 
		 int a = 1;
		 int b = 1;
		 int c = a<10 ? a++ : b++;
		 System.out.println(a+", "+b+", "+c); //2 1 1
		 
		 int d = 1;
		 int e = 2;
		 int f = 3;
		 
		 if (d<10) {
			 f= d++ < 1 ? e++ : f++; //is basically f = f
		 } else {
			 f= (d+e) < 2 ? d++ : e++;
		 }
		 
		 System.out.println(d+", "+e+", "+f); //2 2 3 
		 
		 
	}

}
