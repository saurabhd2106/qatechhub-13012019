package day5;

public class MSWord implements MSOffice {

	@Override
	public void start() {
		System.out.println("Start method from MS Office");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop method from MS Office");
		
	}

	@Override
	public void restart() {
		System.out.println("Restart method from MS Office");
		
	}

}
