package day5;

public class MSExcel implements MSOffice{

	@Override
	public void start() {
		
		System.out.println("Start method from MS Excel");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop method from MS Excel");
		
	}

	@Override
	public void restart() {
		System.out.println("Restart method from MS Excel");
		
	}
	
	public void rerun(){
		System.out.println("Rerun method");
	}

}
