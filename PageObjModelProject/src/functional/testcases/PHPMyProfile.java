package functional.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pom.POLogin;
import pom.POMyProfile;

public class PHPMyProfile {

	@Test
	public void myprofile() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://phptravels.net/login");
		Thread.sleep(2000);

		PageFactory.initElements(driver, POLogin.class);

		POLogin.username.sendKeys("user@phptravels.com");

		POLogin.password.sendKeys("demouser");

		POLogin.submit.click();
		PageFactory.initElements(driver, POMyProfile.class);

		POMyProfile.profile.click();
		POMyProfile.city.sendKeys("LONDON");
		POMyProfile.phone.sendKeys("22334455");
		POMyProfile.submit.click();

		/*
		 * POLogin.username(driver).sendKeys("user@phptravels.com"); //
		 * Thread.sleep(2000);
		 * 
		 * POLogin.password(driver).sendKeys("demouser"); // Thread.sleep(2000);
		 * 
		 * POLogin.submit(driver).click(); // Thread.sleep(2000);
		 * 
		 * POMyProfile.profile(driver).click(); // Thread.sleep(2000);
		 * 
		 * POMyProfile.city(driver).clear();
		 * POMyProfile.city(driver).sendKeys("LONDON"); Thread.sleep(2000);
		 * 
		 * JavascriptExecutor ex = (JavascriptExecutor)driver;
		 * ex.executeScript("window.scrollBy(0, 650)","");
		 * 
		 * 
		 * POMyProfile.phone(driver).clear();
		 * POMyProfile.phone(driver).sendKeys("22334455"); Thread.sleep(2000);
		 * 
		 * POMyProfile.submit(driver).click(); Thread.sleep(2000);
		 * 
		 * 
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
		 * 
		 * WebElement profile = driver.findElement(By.xpath("//a[@href='#profile']"));
		 * profile.click();
		 * 
		 * WebElement city = driver.findElement(By.name("city"));
		 * city.sendKeys("London");
		 * 
		 * WebElement phone = driver.findElement(By.name("phone"));
		 * phone.sendKeys("22334455");
		 * 
		 * WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
		 * sub.click();
		 */

		driver.close();

	}

}
