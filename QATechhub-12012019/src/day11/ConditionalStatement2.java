package day11;

public class ConditionalStatement2 {
	public static void main(String[] args) {
		int num1, num2;

		num1 = 95;
		num2 = 90;

		if (num1 > num2) {
			System.out.println("First number is greatest");
		}
		if (num2 > num1) {
			System.out.println("Second number is greatest");
		}
		if (num1 == num2) {
			System.out.println("Both are equal");
		}
	}

}
