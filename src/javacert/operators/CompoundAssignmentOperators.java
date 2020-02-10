package javacert.operators;

public class CompoundAssignmentOperators {

	public static void main(String[] args) {
		int x = 2;
		int z = 3;
		
		x = x*z; //simple assignment
		x *= z; //using compound assignment
		
		System.out.println("x= "+x); //it's 18

//		int a +=5; //wont compile; havent declared a yet
		
		//Without explicit casting:
		long a = 10;
		int b = 4;
//		b = b * a; //wont compile bc result is long and we want an int
//		b = (int)(b*a); //good but ehh
		b *= a; //short form of the above
		System.out.println("b= "+b); //it's 40
			
		//this works apparently:
		long c = 4;
		long d = (c = 2); //simple assignment, and value is also returned to d
		
		System.out.println("c= "+c+" d= "+d);
	
		long e = 3;
		long f = 2; //this initialization isnt neccessary
		long h = 1;
		long i = e + 3 * (f=3) - (h -=2);
		// 3+3*3-(-1)
		//3+9+1
		//13
		System.out.println("e= "+e); //3
		System.out.println("f= "+f); //3
		System.out.println("h= "+h); //-1
		System.out.println("i= "+i); //13
		
	}

}
