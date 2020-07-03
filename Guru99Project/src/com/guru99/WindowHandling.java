package com.guru99;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/popup.php");
		 driver.findElement(By.xpath("//html//body//p")).click();
		 
		 String Parentwindow = driver.getWindowHandle();
		 System.out.println("Parent window is" + Parentwindow);
		 
		 driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("test@gmail.com");
		 driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		 
		 Set <String> handles =  driver.getWindowHandles();
		 System.out.println("Parent window is" + handles);

		 
	}

}
 