package day9;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonProject {

	ChromeDriver driver;

	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver2.45/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		driver.get("https://amazon.in");
	}

	public void mouseHover() {
		WebElement mainMenu = driver.findElement(By.partialLinkText("Shop by"));

		Actions action = new Actions(driver);

		action.moveToElement(mainMenu).build().perform();

		By mobileAndComputerLinkXpath = By.xpath("//span[text()='Mobiles, Computers']");
		WebElement mobileAccesories = driver.findElement(mobileAndComputerLinkXpath);
		waitTillElementVisible(10, mobileAndComputerLinkXpath);

		action.moveToElement(mobileAccesories).build().perform();

		WebElement allMobileLink = driver.findElement(By.xpath("//span[text()='All Mobile Phones']"));

		action.moveToElement(allMobileLink).click(allMobileLink).build().perform();
	}

	public void closeBrowser() {

		driver.quit();
	}

	public void waitTillElementVisible(int timeoutInseconds, By by) {

		WebDriverWait wait = new WebDriverWait(driver, timeoutInseconds);

		wait.until(ExpectedConditions.visibilityOfElementLocated(by));

	}

	public void fluentWait(int timeout, int pollingTime, By by) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}
