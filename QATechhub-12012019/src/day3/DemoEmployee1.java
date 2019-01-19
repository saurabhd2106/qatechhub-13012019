package day3;

public class DemoEmployee1 {

	public static void main(String[] args) {
		Employee minal = new Employee();

		minal.salary = 90000;
		minal.bonus = 6000;

		minal.calculateSalary();
		
		Employee ayush = new Employee(97000, 3000);

		ayush.calculateSalary();
		
		System.out.println("---------------------------");
		Employee saurabh = new Employee();
		
		saurabh.salary = -80000;
		saurabh.bonus = -5669;
		
		saurabh.calculateSalary();
		
	}

}
