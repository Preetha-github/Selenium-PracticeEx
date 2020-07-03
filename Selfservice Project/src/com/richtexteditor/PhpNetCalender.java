package com.richtexteditor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpNetCalender {

	public static void main(String[] args) throws InterruptedException {

		String month = "July 2020";
		String date = "20";

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://phptravels.net/home");
		Thread.sleep(2000);

		WebElement Checkin = driver.findElement(By.id("checkin"));
		Checkin.click();

		Thread.sleep(2000);
		
		while (true)
		{
			
			//month year.(get text) = extract the value of month and year
		WebElement datepic = driver
				.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[2]"));
		
		String datetext = datepic.getText();

		{
			
				

			if (datetext.equals(month)) {
				System.out.println("month is not equal");
				
				break;

			} else {

				driver.findElement(By.xpath("//div[@class='datepicker--nav-action'][@data-action='next']")).click();
			}
		}
	}
}
}
