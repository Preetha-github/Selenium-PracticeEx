package com.richtexteditor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderexample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Calendar.html");
		Thread.sleep(2000);
		
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();
		
		//datepicker.sendKeys("06/10/2020" + Keys.ENTER);
		
		WebElement next = driver.findElement(By.xpath("//a [@title='Next' ]"));
		next.click();
		

		WebElement select = driver.findElement(By.xpath("//a [contains(text(),'10') ]"));
		select.click();
		
		
		//System.out.println("Selected date is: "+ );
		
		
		
		
		

		
		
	}

}
