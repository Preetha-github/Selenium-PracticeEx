package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.EditPageObjects;




public class EditTestcase {
	WebDriver driver;
	
	@Test
	public void Edit() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		// Maximize the screen
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		//Navigate to url
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Edit.html");
		PageFactory.initElements(driver, EditPageObjects.class);

		EditPageObjects.email_address.sendKeys("test@gmail.com");

		EditPageObjects.Append.sendKeys("added text" + Keys.TAB);
		Thread.sleep(2000);

		String text = EditPageObjects.gettext.getAttribute("value");
		System.out.println("Text is : " + text);
		Thread.sleep(2000);

		EditPageObjects.cleartext.clear();
		Thread.sleep(2000);
		String clear = EditPageObjects.cleartext.getAttribute("value");
		System.out.println("Value is : " + clear);

		String disabled = EditPageObjects.edit_disabled.getAttribute("disabled");
		if (disabled.equals("true")) {
			System.out.println("The field is disabled");

		} else {

			System.out.println("The field is NOT disabled");
		}
		//driver.quit();
	}
	
}
