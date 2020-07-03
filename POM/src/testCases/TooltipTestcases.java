package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import pageObjects.TooltipPageObjects;


public class TooltipTestcases {
	
	WebDriver driver;
	@Test
	public void toolti() {
		
//		Actions actions = new Actions(driver);
//		actions.moveToElement(TooltipPageObjects.Inputbox).
//		actions.getClass()
//		TooltipPageObjects.Inputbox.getText()
//		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();

		// Maximize the screen
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		// Navigate to url
		driver.navigate().to("http://leafground.com/pages/tooltip.html");
		
		PageFactory.initElements(driver, TooltipPageObjects.class);
		
	
		
	String tip = TooltipPageObjects.Inputbox1.getAttribute("title");
	System.out.println(tip);
		
	}

}
