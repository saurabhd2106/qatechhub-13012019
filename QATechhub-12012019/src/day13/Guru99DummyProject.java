package day13;

public class Guru99DummyProject {

	public void invokeBrowser() {
		System.out.println("Invoke Browser...");
	}

	public void login() {
		System.out.println("log in");
	}

	public void addCustomer() throws InterruptedException, ArrayIndexOutOfBoundsException {
		System.out.println("add customer");
		int arr[] = new int[5];
		
		arr[0] = 10;
		arr[1] = 60;
		arr[2] = 50;
		arr[3] = 40;
		arr[4] = 70;
		
		Thread.sleep(3000);

		for (int i = 0; i <= 5; i++) {
			System.out.println(arr[i]);
		}
	}

	public void getCustomerId() {
		System.out.println("get customer id");
	}

	public void addAccount() {
		System.out.println("add account");
	}

	public void logout() {
		System.out.println("log out");
	}

	public void closeBrowser() {
		System.out.println("close browser");
	}

}
