package lao.pack;

import java.awt.AWTException;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableEx {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.navigate().to("http://leafground.com/pages/selectable.html");
		
		List <WebElement> li = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(li.get(0));
		actions.clickAndHold(li.get(1));
		actions.clickAndHold(li.get(2));
		actions.build().perform();
		
		
		

	}

}
