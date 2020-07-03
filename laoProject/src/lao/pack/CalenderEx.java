package lao.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.navigate().to("http://leafground.com/pages/Calendar.html");
		
		WebElement calender = driver.findElement(By.id("datepicker"));
		
		calender.click();
		
		WebElement next = driver.findElement(By.linkText("Next"));
		next.click();
		
		WebElement date = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		date.click();
		
		
		
		
		
		
	}

}
