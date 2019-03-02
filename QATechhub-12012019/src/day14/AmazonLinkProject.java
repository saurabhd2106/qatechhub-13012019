package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinkProject {
	
	ChromeDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver2.45/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.amazon.in/");
		
	}
	
	public void getUrlLink(){
		String url = driver.findElement(By.linkText("Amazon Pay")).getAttribute("href");
		
		System.out.println("URL :: "+ url);
	}
	
	public void getLinkCountOnAPage(){
	List<WebElement> allLinks =	driver.findElements(By.tagName("a"));
	
	System.out.println("Count :: "+ allLinks.size());
	}
	
	public void printAllLinksInfo(){
		List<WebElement> allLinks =	driver.findElements(By.tagName("a"));
		for(WebElement link: allLinks){
			System.out.println(link.getText() + " and its URL :: "+ link.getAttribute("href"));
			
			System.out.println("-------------------------------------------------");
		}
	}

}
