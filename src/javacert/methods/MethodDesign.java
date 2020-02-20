package javacert.methods;

public class MethodDesign {

//	public static void main(String[] args) {
//		
//	}
	
	public void jump() {}
	
//	void public jump2() {} //wont compile bc no return type specified
	
	void jump3() {} //no access modifier, so is by default package-private
	
	public final void jump4() {} //final is (optional) specifier
	
	public static final void jump5() {} //2 specifier (one is tech. not needed in this case)
	
	public final static void jump6() {} //still good; specifier order doesnt matter
	
//	public modifier void jump() {} //wont compile bc modifier isnt a keyword
	
//	public String void jump8() {} //wont compile bc 2 return types...not allowed
	
	final public void jump9() {} //this is OK
//	public void final jump9() {} //this is not ok //cant have modifier after return type
	
	final static public void jump10() {} //also good
	 
	 
	 

	 
}
