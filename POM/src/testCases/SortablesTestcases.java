package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.SortablesPageObjects;

public class SortablesTestcases {

	WebDriver driver;

	@Test
	public void sorta() {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();

		// Maximize the screen
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		// Navigate to url
		driver.navigate().to("http://leafground.com/pages/sortable.html");
		PageFactory.initElements(driver, SortablesPageObjects.class);

		Actions actions = new Actions(driver);

		actions.clickAndHold(SortablesPageObjects.Item7);

		actions.moveToElement(SortablesPageObjects.Item1).release();
		actions.build().perform();

	}

}
