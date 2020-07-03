package functional.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pom.POLogin;

public class PHPLogin {

	
	@Test
	public void login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://phptravels.net/login");
		Thread.sleep(2000);
		
		PageFactory.initElements(driver, POLogin.class);
		
		POLogin.username.sendKeys("user@phptravels.com");
		
		POLogin.password.sendKeys("demouser");
		
		POLogin.submit.click();
		/*
		 * POLogin.username(driver).sendKeys("user@phptravels.com"); Thread.sleep(2000);
		 * 
		 * POLogin.password(driver).sendKeys("demouser"); Thread.sleep(2000);
		 * 
		 * POLogin.submit(driver).click(); Thread.sleep(2000);
		 */
		
		
		
		
		/*
		 * WebElement username = driver.findElement(By.name("username"));
		 * username.sendKeys("user@phptravels.com");
		 * 
		 * WebElement password = driver.findElement(By.name("password"));
		 * password.sendKeys("demouser");
		 * 
		 * WebElement LoginBtn =
		 * driver.findElement(By.xpath("//button[@type='submit']")); LoginBtn.click();
		 */
		
		driver.close();
		
		
		
		
	}
}
