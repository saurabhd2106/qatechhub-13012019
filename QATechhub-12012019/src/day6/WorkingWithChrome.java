package day6;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	
	ChromeDriver driver;
	
	public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Saurabh Dhingra/workspace/libs/chromedriver2.45/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://qatechhub.com");
	}
	
	public void getPageTitle(){
		System.out.println("Page Title : "+ driver.getTitle());
	}
	
	public void navigateCommands(){
		driver.navigate().to("http://www.facebook.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}
	
	public void closeBrowser(){
		//driver.close();
		
		driver.quit();
	}

}
