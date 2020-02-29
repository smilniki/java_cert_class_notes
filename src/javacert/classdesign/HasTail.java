package javacert.classdesign;

public interface HasTail {
	
	//vars are always constant (public, static and final)
	
//	public static final int DEFAULT_TAIL_LENGTH = 2; //redundant
	int DEFAULT_TAIL_LENGTH = 2;
	
	//methods are automatically public and abstract
//	public int getTailLength();
//	public abstract int getTailLength(); //both keywords redundant
	int getTailLength(); //modifiers applied by default
	
	//same rules w abstract class apply to interfaces (ex methods cant have body)
	
//	int getWeight() {}; //cant do this
	

}
