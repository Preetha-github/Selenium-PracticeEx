package com.advanced;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Open the selectable page
		driver.navigate().to("http://leafground.com/pages/sortable.html");

		Thread.sleep(2000);

		List<WebElement> li = driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		System.out.println(li);
		WebElement from = driver.findElement(By.xpath("//*[@id=\'sortable\']/li[7]"));

		WebElement to = driver.findElement(By.xpath("//*[@id=\'sortable\']/li[1]"));

		Actions action = new Actions(driver);

		action.clickAndHold(from).moveToElement(to).release(to).build().perform();

		//

		WebElement from1 = driver.findElement(By.xpath("//*[@id=\'sortable\']/li[7]"));

		WebElement to1 = driver.findElement(By.xpath("//*[@id=\'sortable\']/li[2]"));

		Actions action1 = new Actions(driver);

		action1.clickAndHold(from1).moveToElement(to1).release(to1).build().perform();

		//

		WebElement from2 = driver.findElement(By.xpath("//*[@id=\'sortable\']/li[7]"));

		WebElement to2 = driver.findElement(By.xpath("//*[@id=\'sortable\']/li[3]"));

		Actions action2 = new Actions(driver);

		action2.clickAndHold(from2).moveToElement(to2).release(to2).build().perform();

		//

		WebElement from3 = driver.findElement(By.xpath("//*[@id=\'sortable\']/li[7]"));

		WebElement to3 = driver.findElement(By.xpath("//*[@id=\'sortable\']/li[4]"));

		Actions action3 = new Actions(driver);

		action3.clickAndHold(from3).moveToElement(to3).release(to3).build().perform();

		//
		WebElement from4 = driver.findElement(By.xpath("//*[@id=\'sortable\']/li[7]"));

		WebElement to4 = driver.findElement(By.xpath("//*[@id=\'sortable\']/li[5]"));

		Actions action4 = new Actions(driver);

		action4.clickAndHold(from4).moveToElement(to4).release(to4).build().perform();

		//

		WebElement from5 = driver.findElement(By.xpath("//*[@id=\'sortable\']/li[7]"));

		WebElement to5 = driver.findElement(By.xpath("//*[@id=\'sortable\']/li[6]"));

		Actions action5 = new Actions(driver);
		action5.clickAndHold(from5).moveToElement(to5).release(to5).build().perform();

	}

}
