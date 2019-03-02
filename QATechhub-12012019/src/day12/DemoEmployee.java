package day12;

public class DemoEmployee {

	public static void main(String[] args) {
		
		System.out.println(Employee.count);
		
		Employee e1 = new Employee("Saurabh");
		
		Employee e2 = new Employee("Hargun");

		final Employee e3 = new Employee("Ayush");
		
		e2= new Employee("Hsrgun kaur");
		
		//e3 = new Employee("Hsrgun kaur");
		
		e3.employeeId = 43895;
		
		e3.employeeId = 78435;
		
		
		e1.printEmployeeInfo();
		
		System.out.println("-----------------------------------");
		
		e2.printEmployeeInfo();
		
		System.out.println("-----------------------------------");
		e3.printEmployeeInfo();
		
		Employee.getOrganizationName();
		
	}

}
