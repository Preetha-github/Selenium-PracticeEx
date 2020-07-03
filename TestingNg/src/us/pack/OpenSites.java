package us.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OpenSites {
	WebDriver driver;
	long currentTime;
	long endTime;
	long Total;

	@BeforeSuite

	public void OpenChrome() {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		currentTime = System.currentTimeMillis();
		driver.manage().window().maximize();

	}

	@Test
	public void OpenGoogle() throws InterruptedException {

		driver.get("http://google.com");

	}

	// bing
	@Test
	public void Bing() throws InterruptedException {

		driver.get("http://bing.com");

	}

	@AfterSuite

	public void closeBrowser() {
		endTime = System.currentTimeMillis();
		Total = endTime - currentTime;
		System.out.println("Time taken = " + Total);
		driver.quit();

	}
}
