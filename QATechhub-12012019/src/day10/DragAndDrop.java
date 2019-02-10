package day10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver;
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver2.45/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frameId = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frameId);

		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		String colorBeforeDnD = target.getCssValue("color");
		
		//action.dragAndDrop(source, target).build().perform();
		
		action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		
		String colorAfterDnD = target.getCssValue("color");
		
		
		System.out.println("Color before Drag n Drop : "+ colorBeforeDnD + " color after drag n drop : "+ colorAfterDnD);
		
		driver.switchTo().defaultContent();
		
		
	}

}
