package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.CalenderPageObjects;



public class CalenderTestcases {
	
	WebDriver driver;

	@Test
	public void caltc() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();

		// Maximize the screen
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		// Navigate to url
		driver.navigate().to("http://leafground.com/pages/Calendar.html");

		PageFactory.initElements(driver, CalenderPageObjects.class);
		
		CalenderPageObjects.date.click();
		CalenderPageObjects.next.click();
		CalenderPageObjects.day.click();
		
		driver.quit();
		
		
	}

}
