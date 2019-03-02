package day13;

public class DemoGuru99DummyProject {

	public static void main(String[] args) {
		Guru99DummyProject guru = new Guru99DummyProject();
		
		try {
			guru.invokeBrowser();

			guru.login();

			guru.addCustomer();

			guru.getCustomerId();

			guru.addAccount();

			guru.logout();
		} catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}


	}

}
