package javacert.classdesign;

public class Bear extends Animal implements Omnivore {
	
	@Override
	public void printName() {
		System.out.println("Bear");
	}
	
	@Override
	public int getWeight() {
		return 2000;
	}
	
	@Override
	public void eatPlants() { //code will still compile if comment out bc default method
		System.out.println("Bear eating plants");
	}
	
	@Override
	public void eatMeat() {
		System.out.println("Bear eating meat");
	}
}
