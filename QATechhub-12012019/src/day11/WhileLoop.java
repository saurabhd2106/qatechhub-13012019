package day11;

public class WhileLoop {

	public static void main(String[] args) {

		// Reverse a number

		int num = 776865709;
		// Expected value = 907568677

		int reverseNum = 0;

		while (num != 0) {

			reverseNum = reverseNum * 10 + num % 10;

			num = num / 10;
		}

		System.out.println(reverseNum);
	}

}
