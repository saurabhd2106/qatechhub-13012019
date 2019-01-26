package day4;

public class Machine {
	
	public int machineEngineSize;
	
	private int steringSize;
	
	public Machine(){
		System.out.println("Default Constructor of machine");
	}
	
	protected Machine(int machineEngineSize){
		System.out.println("Constructor of machine");
		
		this.machineEngineSize = machineEngineSize;
	}
	
	void start(){
		System.out.println("Start method from Machine class");
		
		steringSize = 9;
	}

	void stop(){
		System.out.println("stop method from Machine class");
	}
	
	void resume(){
		System.out.println("Resume method from Machine class");
	}
}
