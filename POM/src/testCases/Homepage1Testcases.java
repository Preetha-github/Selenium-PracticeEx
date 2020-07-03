package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.Homepage1PageObjects;

public class Homepage1Testcases {
	WebDriver driver;
	@Test
	public void Homepage1() {
	
	
	System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
	driver.navigate().to("http://testleaf.herokuapp.com/");
	
	PageFactory.initElements(driver, Homepage1PageObjects.class);
	
	Homepage1PageObjects.hyperlink.click();
	
	

}
}
