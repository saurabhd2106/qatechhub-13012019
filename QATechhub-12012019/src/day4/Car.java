package day4;

public class Car extends Machine {

	int carEngineSize;

	public Car() {

		super(29);
		System.out.println("I am car constructor");
	}

	void restart() {
		
		resume();
		
		start();
		
		stop();
		
		machineEngineSize= 90;
		
		System.out.println("Restart method from Car class");
	}

	void rerun() {
		System.out.println("Rerun method from Machine class");
	}

}
