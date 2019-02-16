package day11;

public class ConditionalStatements {

	public static void main(String[] args) {

		// Greatest out of two number

		int num1, num2;

		num1 = 95;
		num2 = 90;

		if (num1 > num2) {
			System.out.println("First number is greatest");
		} else if (num2 > num1) {
			System.out.println("Second number is greatest");
		} else {
			System.out.println("Both are equal");
		}

	}

}
