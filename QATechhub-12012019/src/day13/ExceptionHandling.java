package day13;

public class ExceptionHandling {

	public static void main(String[] args) {

		int[] arr = new int[5];

		try {
			arr[0] = 10;
			arr[1] = 60;
			arr[2] = 50;
			arr[3] = 40;
			arr[4] = 70;

			for (int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occured.. handling it");

			e.printStackTrace();
		}

		catch (IndexOutOfBoundsException e) {
			System.out.println("Exception occured.. handling it");

			e.printStackTrace();
		}

		catch (Exception e) {
			System.out.println("Exception occured.. handling it");

			e.printStackTrace();
		} finally {
			System.out.println("I always execute...");
		}

		System.out.println("After for loop");

	}

}
