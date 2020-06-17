package com.advanced;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrialSortables {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Open the selectable page
		driver.navigate().to("http://leafground.com/pages/sortable.html");

		Thread.sleep(2000);

		
		
		List<WebElement> li = driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		System.out.println(li);
		WebElement from = driver.findElement(By.xpath("//*[@id=\'sortable\']/li[7]"));

		for (int i = 0; i < 6; i++) {
			
		
		WebElement to = driver.findElement(By.xpath("//*[@id=\'sortable\']/li[1]"));

		Actions action = new Actions(driver);

		action.clickAndHold(from).moveToElement(to).release(to).build().perform();
		}
	}

}
