package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import pageObjects.DroppablePageObjects;


public class DroppableTestcases {

WebDriver driver;

@Test
	public void Dropable() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();

		// Maximize the screen
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		// Navigate to url
		driver.navigate().to("http://leafground.com/pages/drop.html");

		PageFactory.initElements(driver, DroppablePageObjects.class);
		
		Actions actions = new Actions(driver);
		//actions.dragAndDrop(DroppablePageObjects.Drag, DroppablePageObjects.Drop).build().perform();
		
		
		actions.clickAndHold(DroppablePageObjects.Drag).moveToElement(DroppablePageObjects.Drop);
		Thread.sleep(2000);
		actions.release(DroppablePageObjects.Drop);
		Thread.sleep(2000);
		actions.build().perform();
		
		
		
	}

}
	