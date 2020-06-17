package com.advanced;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {

	public static void main(String[] args) throws AWTException, InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");


		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://google.com");
		
		
		WebElement key = driver.findElement(By.name("q"));
		key.sendKeys("Trichy");
		//key.submit();
		
		  Robot robot = new Robot();
		  
			/*
			 * robot.keyPress(KeyEvent.VK_T); robot.keyRelease(KeyEvent.VK_T);
			 * robot.keyPress(KeyEvent.VK_R); robot.keyRelease(KeyEvent.VK_R);
			 * robot.keyPress(KeyEvent.VK_I); robot.keyRelease(KeyEvent.VK_I);
			 * robot.keyPress(KeyEvent.VK_C); robot.keyRelease(KeyEvent.VK_C);
			 * robot.keyPress(KeyEvent.VK_H); robot.keyRelease(KeyEvent.VK_H);
			 * robot.keyPress(KeyEvent.VK_Y); robot.keyRelease(KeyEvent.VK_Y);
			 */
		  
		  robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 
		
		
		
		
	}

}
