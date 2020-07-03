package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.SelectablePageObjects;


public class SelectableTestcases {
	WebDriver driver;
	@Test
	public void selecttc() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();

		// Maximize the screen
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		// Navigate to url
		driver.navigate().to("http://leafground.com/pages/selectable.html");

		PageFactory.initElements(driver, SelectablePageObjects.class);
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(SelectablePageObjects.Item7);
		actions.clickAndHold(SelectablePageObjects.Item6);
		actions.clickAndHold(SelectablePageObjects.Item5);
		actions.build().perform();
	}

}
