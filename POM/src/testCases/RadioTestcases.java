package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.RadioPageObjects;

public class RadioTestcases {
	
	WebDriver driver;
	@Test
	public void radio() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
	driver = new ChromeDriver();
	
	// Maximize the screen
	driver.manage().window().maximize();
	
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
	//Navigate to url
	driver.navigate().to("http://testleaf.herokuapp.com/pages/radio.html");
	
	PageFactory.initElements(driver, RadioPageObjects.class);
	
	Boolean radio = RadioPageObjects.Defaultradio.isSelected();
	if (radio.equals(true)) {
		System.out.println("Checked is enabled");
		
	}else {
		
		System.out.println("Unchecked is enabled");
		
	}
	
	RadioPageObjects.AgeGroup.click();
	
	driver.quit();

}
}
