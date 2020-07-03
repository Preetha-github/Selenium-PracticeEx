package com.richtexteditor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		// go to the site
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		
		// By x-path locator
		//driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a")).click();
		
		// test links
		driver.findElement(By.linkText("Go to Home Page")).click();
		//driver.findElement(By.className("wp-categories-icon svg-image")).click();
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/h5")).click();
		
		driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		
		WebElement homebutton = driver.findElement(By.id("home"));
		homebutton.click();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
