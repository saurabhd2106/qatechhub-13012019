package day2;

public class DemoEmployee {

	public static void main(String[] args) {
	
		//Declaring a variable
		Employee saurabh;
		
		//Instantiate a variable and Initializing a variable
		saurabh = new Employee();
		
		saurabh.salary = 90000;
		
		saurabh.bonus= 8000;
		
		saurabh.calculateSalary();
		
		//--------------------------------------------
		
		Employee anjul = new Employee();
	
		anjul.salary = 908403;
		anjul.bonus = 8000;
		
		int anjulSalary = anjul.calculateSalary1();
		
		System.out.println("Anjul's salary : "+ anjulSalary);
		
	}

}
