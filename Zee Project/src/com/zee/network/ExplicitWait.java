package com.zee.network;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Open the selectable page
		driver.get("https://phptravels.net/login");
		
//		long StartTime = System.currentTimeMillis();

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("user@phptravels.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("demouser");

		WebElement submit = driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button"));
		submit.click();

		// Explicit Wait

//		WebElement profile = driver
//				.findElement(By.xpath("//a[contains(text(),'My Profile')]"));

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'My Profile')]"))).click();

//		long EndTime = System.currentTimeMillis();
//		long TotalTime = StartTime - EndTime;
//		System.out.println(TotalTime);

	}

}
