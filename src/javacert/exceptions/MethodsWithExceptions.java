package javacert.exceptions;

public class MethodsWithExceptions {

	public static void main(String[] args) {
		Bear bear = new Bear();
		try {
			bear.eatMeat(-2);
		} catch (NoMoreMeatException e) {
			e.printStackTrace();
			System.out.println("Bear is hungry");
		} finally {
			System.out.println("finally");
		}
		//remember: need to handle child classes before parent classes
		
		bear.eatPlants(-2); //compiles bc unchecked exception
		//doesnt need to be put into try/catch block bc unchecked...would need to be if checked exception
	}
}

class NoMoreMeatException extends Exception {} //this is checked bc extending exception
	
class NoMorePlantsException extends RuntimeException {}

interface Omnivore {
	void eatMeat(int amount) throws NoMoreMeatException; //exception needs to be added here for compilation
	void eatPlants(int amount);
}

class Bear implements Omnivore {
	
	@Override
	public void eatMeat(int amount) throws NoMoreMeatException { //this needed bc checked exception
		if (amount <= 0) {
			throw new NoMoreMeatException();
		}
		System.out.println("Eating meat");
		
	}
	
	@Override
	public void eatPlants(int amount) { //throws not req. here
		if (amount <= 0) {
			throw new NoMorePlantsException(); //ok since unchecked, so dont need to handle or declare
		}
		System.out.println("Eating plants");
		
	}
}