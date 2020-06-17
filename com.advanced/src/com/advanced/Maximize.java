package com.advanced;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Maximize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		
		
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--start-fullscreen");
		
		
		WebDriver driver = new ChromeDriver(chromeoptions);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		
		//1. maximize
		
		//driver.manage().window().maximize();
		
		//2. Rectangle - screensize
		/*
		 * Dimension dimension = new Dimension(1600, 2560);
		 * 
		 * driver.manage().window().setSize(dimension); Thread.sleep(3000);
		 */
		
		
		driver.close();

	}

}
