package com.richtexteditor;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowEx {

		public static void main(String[] args) throws InterruptedException {
			String pathToChrome =  "/Users/preethasoundararajan/Downloads/chromedriver";
			System.setProperty("webdriver.chrome.driver", pathToChrome);
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/automation-practice-switch-windows/");
			String parentWindowHandle = driver.getWindowHandle();
			
			WebElement clickelement = driver.findElement(By.id("button1")); 
			
			for(int i =0; i<3;i++) {
				clickelement.click();
			Thread.sleep(5000);
			}
			
			Set<String> allWindowHandles = driver.getWindowHandles();
			String lastwindowhandle = "";
			for(String handle: allWindowHandles) {
				System.out.println("Switching to windoow::" +handle);
				System.out.println("Navigating to google.com");
				driver.switchTo().window(handle);
				driver.get("https://www.google.com/");
				lastwindowhandle = handle;
			}
			
			// switch to the parent window
			driver.switchTo().window(parentWindowHandle);
			driver.close();
			// now there is no focused window so we are explictly switching some window 
			driver.switchTo().window(lastwindowhandle);
			driver.get("https://demoqa.com/automation-practice-switch-windows/");
		}

	}


