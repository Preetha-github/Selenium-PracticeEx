package advanced.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.navigate().to("http://google.com");

		driver.findElement(By.name("q")).sendKeys("Game of Thornes");

		List<WebElement> li = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		li.

		

		Thread.sleep(2000);
		driver.quit();

	}

}
