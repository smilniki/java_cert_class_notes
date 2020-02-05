package javacert.basics;

// Note: the math class only contains static members
import static java.lang.Math.*;
// Don't need Math.whatever anymore
// instead of wildcard can import specific static members

import static java.lang.System.out;

import static javacert.basics.Config.*;

  
public class StaticImportsExample {

	public static void main(String[] args) {
		int min = min(2,7);
		out.println("Min = "+min);
		out.println(PI);

		printConfig();
		
		System.out.println(NAME);
		
/* Main takeaway: static imports used for importing static members,
	regular imports used for importing classes
		*/
		
//		Bad idea to have lots of static imports (ie, of constants and methods) in large programs
	}

}
