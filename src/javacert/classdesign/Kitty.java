package javacert.classdesign;

public class Kitty extends Animal implements Run {
	
	//2 methods w same sig (in Run+Walk), so code wont compile
	//fix: make Run extend Walk
	//Kitty can just imp Run now (includes Run and Walk)
	
	@Override
	public int getSpeed() {
		return 15;
	}
	
	
	public Kitty(int age) {
		super(age);
	}
	
	@Override
	public int getWeight() {
		return 1;
	}
	
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		
	}
}
