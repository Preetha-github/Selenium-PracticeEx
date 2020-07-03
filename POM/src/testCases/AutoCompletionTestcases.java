package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.AutoCompletionPageObjects;


public class AutoCompletionTestcases {
	
	WebDriver driver;
	@Test
	public void autocomp() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();

		// Maximize the screen
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		// Navigate to url
		driver.navigate().to("http://leafground.com/pages/autoComplete.html");

		PageFactory.initElements(driver, AutoCompletionPageObjects.class);
		
		Actions actions = new Actions(driver);
		AutoCompletionPageObjects.CourseName.sendKeys("p");
		
		actions.moveToElement(AutoCompletionPageObjects.li).click();
		actions.build().perform();
		
		
		driver.close();
		
	}

}
