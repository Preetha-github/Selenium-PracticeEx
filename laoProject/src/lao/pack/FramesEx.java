package lao.pack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.navigate().to("http://leafground.com/");

		driver.findElement(By.linkText("Frame")).click();

		Thread.sleep(2000);

		driver.switchTo().frame(0);

		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();

		String text = driver.findElement(By.id("Click")).getText();
		System.out.println("appeard: " + text);

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);

		driver.switchTo().frame("frame2");

		WebElement button2 = driver.findElement(By.id("Click1"));
		button2.click();

		String text1 = driver.findElement(By.id("Click1")).getText();
		System.out.println("appeard2: " + text1);
		
		
		driver.switchTo().defaultContent();
		
		List<WebElement> li = driver.findElements(By.tagName("iframe"));
		int size = li.size();
		System.out.println("No of iframes: " + size);

		Thread.sleep(2000);

		driver.quit();

	}

}
