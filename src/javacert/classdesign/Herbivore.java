package javacert.classdesign;

public interface Herbivore {
	
//	void eatPlants();
	
	default void eatPlants() {
		System.out.println("Eating plants");
	}
	
//	default int getRequiredPlantAmount(); //wont compile, needs body
	
//	public int getRequiredPlantAmount() { //wont compile bc must be default if has body
//		return;
//	}
	
	

}
