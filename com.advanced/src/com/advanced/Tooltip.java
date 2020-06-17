package com.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) throws InterruptedException {
		
		String ttip = "We ask for your age only for statistical purposes.";
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// maximize the window
		driver.manage().window().maximize();

		// open the site
		driver.get("http://demoqa.com/tooltip/");
		Thread.sleep(3000);
		
		WebElement tooltip = driver.findElement(By.id("age"));
		
		String txt = tooltip.getAttribute("title");
		System.out.println("txt: "+ txt);
		
		//Verification if tooltip is passing/failing
		
		if (txt.equalsIgnoreCase(ttip)) {
			System.out.println("Tooltip is matching = PASS");
			
		}else
		{
			System.out.println("Tooltip is NOT matching = FAIL");
		}
		
		driver.quit();
	}

}
