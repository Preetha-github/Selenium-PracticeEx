package com.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipdiv {

	public static void main(String[] args) throws InterruptedException {
		//String ttip = "We ask for your age only for statistical purposes.";
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// maximize the window
		driver.manage().window().maximize();

		// open the site
		driver.get("http://demoqa.com/tooltip-and-double-click/");
		Thread.sleep(3000);
		
		Actions actions = new Actions (driver);
		
		WebElement tool = driver.findElement(By.id("tooltipDemo"));
		
		actions.moveToElement(tool).perform();
		
		WebElement tootxt = driver.findElement(By.cssSelector("tooltiptext"));
		
		String tt = tootxt.getText();
		System.out.println(tt);

		
	}

}
