package com.advanced;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");

		String ParentWindow = driver.getWindowHandle();
		System.out.println("PartentWindow:+: " + ParentWindow);

		Thread.sleep(6000);
		WebElement Home = driver.findElement(By.id("home"));
		Home.click();

		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		int WindowsNumber = allwindows.size();

		System.out.println("Total number of windows opened: " + WindowsNumber);

		for (String newWindow : allwindows) {

			driver.switchTo().window(newWindow);
			System.out.println(" Window:" + newWindow);

		}
		driver.close();

		driver.switchTo().window(ParentWindow);

		WebElement Color = driver.findElement(By.xpath("//*[@id=\"color\"]"));
		Color.click();

		Set<String> Totwindows = driver.getWindowHandles();
		System.out.println("Total Windows: " + Totwindows);

		for (String Win : Totwindows) {
			if (!Win.equals(ParentWindow)) {
				driver.switchTo().window(Win);
				driver.close();
			}
		}
		

		driver.quit();
	}

}
