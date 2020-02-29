package javacert.classdesign;

public interface Run extends Walk {

	default int getSpeed() { //is now overriding method in Walk
		return 10;
	}
}
