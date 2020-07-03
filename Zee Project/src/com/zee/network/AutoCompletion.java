package com.zee.network;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoCompletion {
    @Test
    
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Open the selectable page
		driver.get("http://leafground.com/pages/autoComplete.html");
		Thread.sleep(2000);
		
	

		WebElement CourseBox = driver.findElement(By.id("tags"));
		CourseBox.sendKeys("S");
		
		List<WebElement> tool = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
//		List<WebElement> li = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
	System.out.println("print --" + tool);
		
//		Thread.sleep(3000);
//		System.out.println(li.size());
		
		for (WebElement webElement : tool) {
			if (webElement.getText().equals("Web Services")) {
				System.out.println("Selected:"+ webElement.getText());
				webElement.click();
				
				break;
		
		  }
		  
		  }
		driver.close();
		 
	}

}
