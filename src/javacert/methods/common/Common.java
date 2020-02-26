package javacert.methods.common;

public class Common {

	public int publicNumber = 10;
	
	protected int protectedNumber = 20;
	
	int defaultNumber = 30;
	
	private int privateNumber = 40;
	
	// Note: same rules for methods apply to vars
	
	public void publicPrint() {
		System.out.println("public");
	}
	
	 protected void protectedPrint() {
		 System.out.println("protected");
	 }
	 
	 void defaultPrint() {
		 System.out.println("default");
	 }
	 
	 private void privatePrint() {
		 System.out.println("private");
	 }
	
	
	 public static void main(String[] args) {
		
		//bc the methods arent static, need to create instance of class to call em
		
		 Common common = new Common();
		 
		 common.publicPrint();
		 common.protectedPrint();
		 common.defaultPrint();
		 common.privatePrint(); 
		 
		 System.out.println(common.publicNumber);
		 System.out.println(common.protectedNumber);
		 System.out.println(common.defaultNumber);
		 System.out.println(common.privateNumber);
		 

	}
}
