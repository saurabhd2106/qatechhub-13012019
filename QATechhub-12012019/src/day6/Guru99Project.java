package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Project {

	ChromeDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver2.45/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/v4/");
	}
	
	public void login(String username, String password){
		
		WebElement userId;
		
		userId = driver.findElement(By.name("uid"));
		
		userId.sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("btnLogin")).click();
	}
	
	public void addCustomer(){
		driver.findElement(By.linkText("New Customer")).click();
		
		driver.findElement(By.name("name")).sendKeys("Minal");
		
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		driver.findElement(By.name("dob")).sendKeys("06/21/1989");
		driver.findElement(By.name("addr")).sendKeys("Gurgaon \n Haryana");
		driver.findElement(By.name("city")).sendKeys("Gurgaon");
		driver.findElement(By.name("state")).sendKeys("Hayana");
		driver.findElement(By.name("pinno")).sendKeys("789456");
		driver.findElement(By.name("telephoneno")).sendKeys("9856985789");

		String emailId = "aa" + System.currentTimeMillis() + "@gmail.com";
		System.out.println("Email Id : " + emailId);
		driver.findElement(By.name("emailid")).sendKeys(emailId);

		driver.findElement(By.name("password")).sendKeys("gsdfdf");

		driver.findElement(By.name("sub")).click();
	}
	
	public String getCustomerId(){
		return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
	}
	
	public void addAccount(String customerId){
		
		driver.findElement(By.linkText("New Account")).click();
		
		driver.findElement(By.name("cusid")).sendKeys(customerId);
		
		WebElement selDropdown = driver.findElement(By.name("selaccount"));
		Select selAccount = new Select(selDropdown);
		
		selAccount.selectByVisibleText("Current");
		
		driver.findElement(By.name("inideposit")).sendKeys("583465");
		
		driver.findElement(By.name("button2")).click();
	}
	
	public void closeBrowser(){
		
		driver.quit();
	}

}
