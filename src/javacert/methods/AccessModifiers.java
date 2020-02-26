package javacert.methods;

import javacert.methods.common.Common;

public class AccessModifiers {

	//default = no modifier
	
	
	public static void main(String[] args) {
		Common common = new Common();
		
		//Note: can only access public method bc in diff package
		common.publicPrint();
		
//		common.protectedPrint(); //wont compile
		
		System.out.println(common.publicNumber); //ok
//		System.out.println(common.protectedNumber);
//		System.out.println(common.defaultNumber);
//		System.out.println(common.privateNumber);

	}

}
