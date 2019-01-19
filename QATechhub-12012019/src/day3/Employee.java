package day3;

public class Employee {

	int salary;

	int bonus;

	//Normal constructor
	Employee() {

		System.out.println("I am a constructor");
		salary = 70000;
		bonus = 5000;

	}
	
	//Parameterized constructor
	Employee(int salary, int bonus) {
		
		this.salary = salary;
		this.bonus = bonus;

	}

	void calculateSalary() {
		int totalSalary = salary + bonus;

		System.out.println("Total Salary : " + totalSalary);
	}

	int calculateSalary1() {
		int totalSalary = salary + bonus;

		return totalSalary;
	}

	int calculateSalary2(int sal, int bon) {
		int totalSalary = sal + bon;

		return totalSalary;
	}

	//this keyword is used to give access to class level variable over argument level variable
	int calculateSalary3(int salary, int bonus) {
		int totalSalary = this.salary + this.bonus;

		return totalSalary;
	}
}
