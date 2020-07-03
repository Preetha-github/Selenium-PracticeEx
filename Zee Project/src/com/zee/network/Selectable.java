package com.zee.network;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selectable {
	
	@Test

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		//Open the selectable page
		driver.get("http://leafground.com/pages/selectable.html");
		Thread.sleep(2000);
		
		//
		Actions actions = new Actions(driver);
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		
		/*
		 * actions.clickAndHold(selectable.get(0)) .clickAndHold(selectable.get(1))
		 * .clickAndHold(selectable.get(3)).build().perform();
		 */
		
		actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(3)).build().perform();
		Thread.sleep(2000);
		System.out.println("Done");
		
		driver.close();
		
		
		
		
		
		

	}

}
