package javacert.methods.common;

public class AnotherCommon {

	public static void main(String[] args) {
		Common common = new Common();
		
		//cant access private method now
		common.publicPrint();
		common.protectedPrint();
		common.defaultPrint();
		
//		common.privatePrint(); //error; wont compile
		
		System.out.println(common.publicNumber); //ok
		System.out.println(common.protectedNumber); //ok -- internal access
		System.out.println(common.defaultNumber); //ok
//		System.out.println(common.privateNumber); //not ok
		
		
	}
}
