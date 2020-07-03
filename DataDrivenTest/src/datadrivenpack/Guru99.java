package datadrivenpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Guru99 {
	
	@Test
	@Parameters({"Search"})
	public void searchIndia (String country) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(country);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}
	
	
	

}
