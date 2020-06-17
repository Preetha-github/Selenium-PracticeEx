package com.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Underline {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");


		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://google.com");

		WebElement link = driver.findElement(By.xpath("//a[text()='Helpful learning resources for families']"));
		
		
		String before = link.getCssValue("text-decoration");
		
		
		System.out.println("Before: " + before );
		
		Actions action = new Actions(driver);
		action.moveToElement(link).build().perform();
		
		String after = link.getCssValue("text-decoration");
		System.out.println("After: " + after);
		
		driver.close();
		
		
		
		
		
		
	}

}
