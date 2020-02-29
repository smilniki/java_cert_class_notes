package javacert.classdesign;

public interface Carnivore {

//	void eatMeat();
	
	default void eatMeat() {
		System.out.println("Eating meat");
	}
}
