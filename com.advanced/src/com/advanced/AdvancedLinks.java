package com.advanced;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Open the selectable page
		driver.navigate().to("http://leafground.com/pages/Link.html");

		Thread.sleep(2000);

		WebElement link1 = driver.findElement(By.xpath("//a [text()='Go to Home Page']"));
		link1.click();

		driver.navigate().back();

		// Find where am supposed to go without clicking me?

		WebElement link2 = driver.findElement(By.xpath("//a [@href='Button.html']"));
		String txt = link2.getAttribute("href");
		System.out.println("supposed to go to: " + txt);

		// Verify am I broken?
		WebElement broken = driver.findElement(By.xpath("//a [@href='error.html']"));
		broken.click();

		String title = driver.getTitle();
		System.out.println("title is" + title);

		if (title.contains("404")) {
			System.out.println("Page is broken");

		} else {
			System.out.println("Page is NOT broken");
		}

		driver.navigate().back();

		WebElement link11 = driver.findElement(By.xpath("//a [text()='Go to Home Page']"));
		link11.click();

		driver.navigate().back();


		// number of links

		List<WebElement> num = driver.findElements(By.tagName("a"));
		int size = num.size();
		System.out.println("Number of links in the page: " + size);

	}

}
