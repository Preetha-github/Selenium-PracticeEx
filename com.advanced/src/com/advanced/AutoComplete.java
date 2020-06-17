package com.advanced;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/preethasoundararajan/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// maximize the window
		driver.manage().window().maximize();

		// go to url
		driver.get("http://leafground.com/pages/autoComplete.html");
		Thread.sleep(3000);
		
		WebElement CourseName = driver.findElement(By.id("tags"));
		CourseName.sendKeys("S");
		
		List <WebElement> li = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		System.out.println("print --" + li);
		
		for (WebElement webEle : li) {
			if (webEle.getText().equalsIgnoreCase("Web Services")) {
				
				System.out.println("print" + webEle.getText());
				webEle.click();
				break;
			}
				
			
		}
driver.close();

	}

}
