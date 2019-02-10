package day10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTesting {
	
	WebDriver driver;
	
	public void invokeBrowser(String browsertype){
		
		if(browsertype.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver2.45/chromedriver.exe");

			driver = new ChromeDriver();
		} else if(browsertype.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");

			driver = new FirefoxDriver();
		} else if(browsertype.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/MicrosoftWebDriver.exe");

			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		driver.get("http://qatechhub.com");
		
		System.out.println(driver.getTitle());
		
	}

}
