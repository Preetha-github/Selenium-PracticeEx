package com.guru99;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindowHandlingExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		WebElement cusid = driver.findElement(By.xpath("//input[@name='cusid']"));
		cusid.sendKeys("12345");
		
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		
		
		//WebElement resetButton = driver.findElement(By.xpath("//input[@name='res']"));
		//resetButton.click();
		//cusid.sendKeys("12345");
		
		
		//Alert
		
		Alert alertObj = driver.switchTo().alert();
		
		//String txt = alertObj.getText();
		
		
		//System.out.println("Alert message displayed is:" + txt);
		alertObj.accept();
		
		
		Thread.sleep(3000);
		
		
		
		driver.quit();
		
		
		
		
		
		
	}

}
