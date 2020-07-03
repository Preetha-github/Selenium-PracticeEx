package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.object.LoginPO;
import page.object.MyProfilePO;

@Test
public class MyProfileTestCases {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://phptravels.net/login");

		PageFactory.initElements(driver, LoginPO.class);

		LoginPO.username.sendKeys("user@phptravels.com");
		LoginPO.password.sendKeys("demouser");
		LoginPO.submit.click();

		PageFactory.initElements(driver, MyProfilePO.class);
		
		MyProfilePO.MyProfile.click();
		MyProfilePO.city.sendKeys("London");
		MyProfilePO.phone.sendKeys("12345");
		MyProfilePO.submit.click();
		
		/*
		 * LoginPO.username(driver).sendKeys("user@phptravels.com");
		 * LoginPO.password(driver).sendKeys("demouser");
		 * LoginPO.submit(driver).click();
		 * 
		 * MyProfilePO.MyProfile(driver).click();
		 * MyProfilePO.city(driver).sendKeys("London");
		 * MyProfilePO.phone(driver).sendKeys("12345");
		 * MyProfilePO.submit(driver).click();
		 */

	}

}
