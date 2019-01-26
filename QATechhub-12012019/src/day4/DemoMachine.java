package day4;

public class DemoMachine {

	public static void main(String[] args) {

		Machine mac = new Machine(20);
		mac.start();
		mac.stop();
		mac.resume();
		
		mac.machineEngineSize = 90;
		System.out.println("-------------------------------------------");
		Car alto = new Car();

		System.out.println("-------------------------------------------");

		alto.start();
		alto.rerun();
		alto.restart();
		alto.resume();
		alto.stop();
		System.out.println("-------------------------------------------");

		Machine figo = new Car();

		figo.start();
		figo.stop();
		figo.resume();

		figo.machineEngineSize = 90;

	}

}
