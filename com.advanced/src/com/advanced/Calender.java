package com.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Open the selectable page
		driver.navigate().to("http://leafground.com/pages/Calendar.html");

		Thread.sleep(2000);

		//
		// Actions actions = new Actions(driver);
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();

		// datepicker.sendKeys("06/10/2020" + Keys.ENTER);

		WebElement Next = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]"));
		Next.click();

		WebElement date = driver.findElement(By.xpath("//a[text()='11']"));
		date.click();

		Thread.sleep(2000);
		driver.close();

	}

}
