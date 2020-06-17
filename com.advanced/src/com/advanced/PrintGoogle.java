package com.advanced;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintGoogle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");


		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://google.com");
		
		
		driver.findElement(By.name("q")).sendKeys("Game of Thrones" +Keys.ENTER );
		
		driver.findElements(By.tagName("a"));
		
		
//		List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		Thread.sleep(3000);
		
		
		
		
//		for (WebElement web : list) {
//			System.out.println("suggessions:" + web.getText());
//			
			
			
//			  if (web.getText().contains("cast")) { web.click();
//			  break;
			  
//			  }
			 
			 
		
		
		}
		

	//	list.get(7).click();

	

}

