package day6;

public class DemoGuru99Project {

	public static void main(String[] args) {
		Guru99Project guru = new Guru99Project();
		
		guru.invokeBrowser();
		
		guru.login("mngr175588", "tenyqEt");
		
		guru.addCustomer();
		
		String customerId = guru.getCustomerId();
		
		System.out.println("Customer Id : "+ customerId);
		
		guru.addAccount(customerId);
	}

}
