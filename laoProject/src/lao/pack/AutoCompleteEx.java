package lao.pack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoCompleteEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.navigate().to("http://leafground.com/pages/autoComplete.html");

		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("C");
		
		Actions actions = new Actions(driver);
		List <WebElement> suggesstionlist = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		
		for (WebElement webElement : suggesstionlist) {
			if (webElement.getText().equals("Cucumber")) {
				actions.moveToElement(webElement).click();
				actions.build().perform();
				break;
			}
			
		}
		
		
	}

}
