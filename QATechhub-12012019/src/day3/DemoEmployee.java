package day3;

public class DemoEmployee {

	public static void main(String[] args) {

		Employee puja = new Employee();

		int pujaSalary = puja.calculateSalary2(10000, 5000);

		System.out.println("Puja's salary : " + pujaSalary);
		
		System.out.println("--------------------------------");
		Employee rahul = new Employee();
		
		rahul.salary = 90000;
		rahul.bonus = 7000;
		
		int rahulSalary = rahul.calculateSalary3(50000, 6000);
		
		System.out.println(rahulSalary);
	}

}
