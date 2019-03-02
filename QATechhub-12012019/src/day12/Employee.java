package day12;

public class Employee {

	int employeeId;

	String nameOfTheEmployee;

	final static String nameOfOrganization;
	
	final static int organizationCode = 98945;

	static int count;

	static {

		System.out.println("I am in a static block");

		nameOfOrganization = "QA Tech Hub pvt. ltd.";
		
		count = 5001;
	}

	static {

		System.out.println("I am in second static block");

	}

	public Employee(String nameOfTheEmployee) {

		this.nameOfTheEmployee = nameOfTheEmployee;

		this.employeeId = getEmployeeId();
	}

	private int getEmployeeId() {
		
		return count++;
	}

	public void printEmployeeInfo() {
		System.out.println("Employee Id : " + employeeId);

		System.out.println("Employee Name : " + nameOfTheEmployee);

		System.out.println("Organization : " + nameOfOrganization);
	}
	
	public static String getOrganizationName(){
		
		return nameOfOrganization;
	}

}
