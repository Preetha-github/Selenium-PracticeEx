package functional.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageObjectWithOutFindBy {

	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;
	
	@Test
	public void Login() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(2000);
	
	PageFactory.initElements(driver, PageObjectWithOutFindBy.class);
	
	txtUsername.sendKeys("Admin");
	txtPassword.sendKeys("admin123");
	btnLogin.click();
	driver.close();
	
}
}
