package day2;

public class Employee {
	
	int salary;
	
	int bonus;
	
	void calculateSalary(){
		int totalSalary = salary + bonus;
		
		System.out.println("Total Salary : "+ totalSalary);
	}
	
	int calculateSalary1(){
		int totalSalary = salary + bonus;
		
		return totalSalary;
	}
	
	
	
}
