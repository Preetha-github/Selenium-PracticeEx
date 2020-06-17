package com.advanced;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Open the selectable page
		driver.navigate().to("http://leafground.com/pages/selectable.html");

		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		System.out.println("all selectables: " + list);
		
		//actions.clickAndHold(list.get(0)).clickAndHold(list.get(1)).clickAndHold(list.get(3)).build().perform();
		
		actions.keyDown(Keys.CONTROL).click(list.get(0)).click(list.get(1)).click(list.get(4)).build().perform();
		
		
		Thread.sleep(4000);
		
		driver.close();
	}

}
