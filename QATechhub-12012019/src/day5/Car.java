package day5;

public class Car extends Vehicle{
	
	public void rerun(){
		System.out.println("Rerun method from Car class");
	}
	
	protected void start(){
		System.out.println("Start method from Car class");
	}

}
