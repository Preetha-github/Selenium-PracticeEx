package com.zee.network;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://google.com");

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Game of Thrones" + Keys.ENTER);
		
		List<WebElement> Totalurl = driver.findElements(By.xpath("//cite"));
		
		for (WebElement webElement : Totalurl) {
			//System.out.println(webElement.getAttribute("href"));
			System.out.println(webElement.getText());
		}
		
		
		
		

		

		driver.quit();

	}

}




