package day15;

public class DemoAmazonProject {

	public static void main(String[] args) {
		AmazonProject amazon = new AmazonProject();
		
		amazon.invokeBrowser();
		
		String result = amazon.searchProduct("Apple watch", "Electronics");
		
		System.out.println("Result :: "+ result);

		System.out.println(amazon.getNthProduct(10));
		
		amazon.printAllProductInfoViaScrollDownUsingJS();
	}

}
