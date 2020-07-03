package com.richtexteditor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bdaydatepicker {

	public static void main(String[] args) throws InterruptedException {
		
		//Chrome Browser
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://demo.guru99.com/test/");
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("//*[@aria-label='Open the date view']"));
		date.click();
		
		
		
		WebElement SelectMonth = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']/div/div[@class='k-header']/a[2]"));
		
		SelectMonth.click();
		
		WebElement Month = driver.findElement(By.xpath("//a [contains(text(),'Aug')]"));
		Month.click();
		
WebElement SelectYear = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']/div/div[@class='k-header']/a[2]"));
		
WebElement leftarrow = driver.findElement(By.xpath("//*[@id=\"977ca27a-963d-4a9f-8cef-0473bde80570\"]/div[1]/a[1]/span"));

		SelectYear.click();
		
		

	}

}
