package west_Hounslow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickQA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		//maximize the window
		driver.manage().window().maximize();

		//open the site
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		Thread.sleep(2000);
		
		//Actions
		
		Actions actions = new Actions(driver);
		
		//doubleclick
		
		WebElement dbBtn = driver.findElement(By.id("doubleClickBtn"));
		
		//implement actions
		Thread.sleep(2000);
		actions.doubleClick(dbBtn).perform();
		
		//switch to alert
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//close the window
		
		driver.close();
		

	}

}
