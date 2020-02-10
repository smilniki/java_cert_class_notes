package javacert.operators;

import javax.swing.text.StyledEditorKit.BoldAction;

public class ConditionalOperators {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean d = a && b; //false
		boolean e = a || b; //true
		System.out.println("d= "+d);
		System.out.println("e= "+e);

		int f = 4;
		boolean g = false && (f++ < 4); //SHORT-CIRCUITING BEHAVIOR HAPPENS
		// (f++ < 4) is never executed!
		//it doesn't matter what comes after false, result will be false!
		
		boolean h = (f-- == 4) && !g; //h is true, f is now 3
		
		System.out.println("f= "+f); //3
		System.out.println("g= "+g); //false
		System.out.println("h= "+h); //true
		
		int myInt = 3;
		int anotherInt = 4;
		boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);
		//true && true || false
		// true || whatever --> true LAST EXP NEVER EVALUATED BC SHORT-CIRCUITING
		
		System.out.println("myInt= "+myInt); //3
		System.out.println("anotherInt= "+anotherInt); //3
		System.out.println("myBoolean= "+myBoolean); //true
		
		boolean x = true, z = false;
		int y = 20;
		x = (y!=10) ^ (z=false); //2nd expr is assignment! true^false -> true
		
		System.out.println(x+", "+y+", "+z); // true  20 false
		
	}

}
