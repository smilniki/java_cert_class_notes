package javacert.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		int x = +3; //is redundant
		System.out.println("x= "+x);

		double y = -x;
		System.out.println("x= "+x+" y= "+y); //x doesn't change, y is -3.0
		
		y = -y; //-1*y
		System.out.println("x= "+x+" y= "+y); //y is 3.0
		
		boolean a = true;
		boolean b = !a;
		System.out.println("a= "+a+" b= "+b);
		
		b=!b; //! works only w booleans
		System.out.println("a= "+a+" b= "+b);
		
		// Note: in Java, 0 and 1 and true and false ARE NOT RELATED
		
//		int myInt = !5; //doesnt compile
//		boolean myBoolean = -true; //also wont compile
//		boolean z = !0; //doesnt compile
		
		// Note: increment and decrement have higher precedence than arith ops (add, sub...)
		int myInt = 5;
		int otherInt = ++myInt; //myInt becomes 6 !!!!
		System.out.println("myInt= "+myInt+" otherInt= "+otherInt); //both 6 !!!
		
		int newInt = 5;
		int newOtherInt = newInt++; //newOtherInt is 5, newInt is 6
		System.out.println("newInt= "+newInt+" newOtherInt= "+newOtherInt);
	
		int count = 0;
		System.out.println(count);
		System.out.println(++count);
		System.out.println(count);
		System.out.println(count--);
		System.out.println(count);
		
		// Exam questions
		int e = 3;
		int f = ++e*5/e-- + --e;
		//4*5/e-- + --e     --> e is 4
		//4*5/4 + --e     --> e is 3
		//4*5/4 + 2		--> e is 2
		// ...7
		System.out.println("e= "+e+" f= "+f); //e is 2, f is 7
		
		
		int g = 6;
		int h = 2;
		int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
		//3 + --g * 3 + 2 * g++ - h-- % --g   	-> g is 6, h is 3
		//3 + 5 * 3 + 2 * g++ - h-- % --g   	-> g is 5, h is 3	
		//3 + 5 * 3 + 2 * 5 - h-- % --g   	-> g is 6, h is 3	<-- USE g, then increment!
		//3 + 5 * 3 + 2 * 5 - 3 % --g   	-> g is 6, h is 2	<-- use h, then decrement!
		//3 + 5 * 3 + 2 * 5 - 3 % 5   	-> g is 5, h is 2
		//3 + 15 + 2 * 5 - 3 % 5
		//3 + 15 + 10 - 3 % 5
		//3 + 15 + 10 - 3
		//3 + 15 + 10 - 3
		//18 + 10 -3
		//28-3 = 25
		System.out.println("g= "+g+" h= "+h+" i= "+i); 
		// gotta be careful af w increment and decrement!!
	}

}
