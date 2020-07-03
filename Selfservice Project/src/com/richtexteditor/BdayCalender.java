package com.richtexteditor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BdayCalender {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://demo.guru99.com/test/");
		Thread.sleep(2000);
		
		WebElement datefield = driver.findElement(By.xpath("//input [@type='datetime-local']"));
		datefield.sendKeys("10081978" + Keys.TAB + "1000");
		
		WebElement submit = driver.findElement(By.xpath("//input [@type='submit']"));
		submit.click();
		
		System.out.println("");
		
	}

}
