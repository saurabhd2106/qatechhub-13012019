package day15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonProject {

	WebDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver2.45/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.amazon.in/");

	}

	public String searchProduct(String product, String category) {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select selCategory = new Select(dropdown);

		selCategory.selectByVisibleText(category);

		driver.findElement(By.xpath("//input[@value='Go']")).click();

		return driver.findElement(By.id("s-result-count")).getText();
	}

	public String getNthProduct(int productNumber) {

		String productXpath = String.format("//div[@id='resultsCol']//ul[@id='s-results-list-atf']/li[%d]",
				productNumber);

		return driver.findElement(By.xpath(productXpath)).getText();
	}

	public void printAllProductInfo() {

		List<WebElement> allProducts = driver
				.findElements(By.xpath("//div[@id='resultsCol']//ul[@id='s-results-list-atf']/li"));

		int productCount = allProducts.size();

		System.out.println("Total product count : " + productCount);

		for (WebElement product : allProducts) {
			System.out.println(product.getText());

			System.out.println("-------------------------------------------");
		}
	}

	public void printAllProductInfoViaScrollDown() {

		List<WebElement> allProducts = driver
				.findElements(By.xpath("//div[@id='resultsCol']//ul[@id='s-results-list-atf']/li"));

		int productCount = allProducts.size();

		System.out.println("Total product count : " + productCount);

		Actions action = new Actions(driver);

		for (WebElement product : allProducts) {

			action.moveToElement(product).build().perform();

			System.out.println(product.getText());

			System.out.println("-------------------------------------------");
		}
	}

	public void printAllProductInfoViaScrollDownUsingJS() {

		List<WebElement> allProducts = driver
				.findElements(By.xpath("//div[@id='resultsCol']//ul[@id='s-results-list-atf']/li"));

		int productCount = allProducts.size();

		System.out.println("Total product count : " + productCount);

		int x, y;
		for (WebElement product : allProducts) {
			x = product.getLocation().x;
			y = product.getLocation().y;
			
			System.out.println("X location : "+ x);
			System.out.println("Y location : "+ y);
			
			scrollDown(x, y);
			
			System.out.println(product.getText());

			System.out.println("-------------------------------------------");
		}
	}
	
	private void scrollDown(int X, int Y){
		
		JavascriptExecutor jsEngine;
		
		String jsCommand;
		
		jsEngine = (JavascriptExecutor) driver;
		
		jsCommand = String.format("window.scrollBy(%d,%d)", X, Y);
		
		jsEngine.executeScript(jsCommand);
	}
}
