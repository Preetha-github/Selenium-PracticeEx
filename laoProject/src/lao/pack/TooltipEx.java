package lao.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipEx {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.navigate().to("http://leafground.com/");

		Thread.sleep(2000);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scroll(0,700)", "");

		WebElement checkbox = driver.findElement(By.linkText("Tool Tip"));
		checkbox.click();

		WebElement YourName = driver.findElement(By.id("age"));
		String title = YourName.getAttribute("title");
		System.out.println("Tooltip is :" + title);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(YourName).click();
		actions.build().perform();
		

		

		Thread.sleep(2000);

		driver.quit();

	}

}
