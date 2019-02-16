package day11;

public class GreatestOutOfThreeNumbers {

	public static void main(String[] args) {

		int num1, num2, num3;

		num1 = 90;
		num2 = 89;
		num3 = 99;

		if ((num1 > num2) && (num1 > num3)) {

			System.out.println("Number 1 is greatest");
		} else if ((num2 > num3) && (num2 > num1)) {

			System.out.println("Number 2 is greatest");
		} else if ((num3 > num1) && (num3 > num2)) {

			System.out.println("Number 3 is greatest");
		} else if ((num2 == num3) && (num2 > num1)) {

			System.out.println("Number 2 and 3 are greater than 1");
		} else if ((num1 == num2) && (num2 > num3)) {

			System.out.println("Number 2 and 1 are greater than 3");
		} else if ((num1 == num3) && (num1 > num2)) {

			System.out.println("Number 3 and 1 are greater than 2");
		} else {
			System.out.println("All three numbers are equal");
		}

	}

}
