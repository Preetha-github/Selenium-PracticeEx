package com.advanced;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		
		  WebElement user = driver.findElement(By.name("username"));
		  user.sendKeys("user@phptravels.com" + Keys.ENTER);
		  
		  WebElement pass = driver.findElement(By.name("password"));
		  pass.sendKeys("demouser" + Keys.ENTER);
		  
		  
		  
		  WebDriverWait wait = new WebDriverWait(driver, 20); WebElement Profile =
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		  "/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"
		  )));
		  
		  Profile.click();
		 
		

	}

}
