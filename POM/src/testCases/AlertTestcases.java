package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.AlertPageObjects;

public class AlertTestcases {
	WebDriver driver;
	
	@Test
	public void Alert() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/preethasoundararajan/Downloads/geckodriver");
		
		driver = new FirefoxDriver();
		
	
		
		// Maximize the screen
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		//Navigate to url
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Alert.html");
		
		PageFactory.initElements(driver, AlertPageObjects.class);
		
		AlertPageObjects.AlertBox.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		AlertPageObjects.ConfirmBox.click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		AlertPageObjects.PromptBox.click();
		driver.switchTo().alert().sendKeys("lao" + Keys.ENTER);
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
	}

}
