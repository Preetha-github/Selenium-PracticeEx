package com.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");


		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://echoecho.com/htmlforms11.htm");
		
		driver.manage().window().maximize();
		
		//SCROLL TO SOME POSITION
		
		
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor) driver;
		 * executor.executeScript("window.scroll(0,600)", ""); Thread.sleep(4000);
		 * executor.executeScript("window.scroll(0,-600)", "");
		 */
		 
		 
		
		//scrolldown to visible screen height
		
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor) driver;
		 * executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		 * Thread.sleep(4000); executor.executeScript("window.scroll(0,0)", "");
		 */
		  
		//  Scroll to an element
		  
		  JavascriptExecutor executor = (JavascriptExecutor) driver;
		 WebElement link= driver.findElement(By.linkText("online tool"));
		 executor.executeScript("arguments[0].scrollIntoView(true)", link);
		
		driver.close();
		
		

	}

}
