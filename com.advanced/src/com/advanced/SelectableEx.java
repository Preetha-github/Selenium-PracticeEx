package com.advanced;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/preethasoundararajan/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// maximize the window
		driver.manage().window().maximize();

		// go to url
		driver.get("http://leafground.com/pages/selectable.html");
		Thread.sleep(3000);

		List<WebElement> multiselect = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int size = multiselect.size();
		System.out.println(size);

		Actions actions = new Actions(driver);

		/*
		 * actions.keyDown(Keys.CONTROL).click(multiselect.get(0)) //
		 * .click(multiselect.get(1)).click(multiselect.get(2)) .keyUp(Keys.CONTROL)
		 * .build().perform();
		 */

		/*
		 * Actions actions = new Actions(driver); Thread.sleep(3000);
		 * actions.keyDown(Keys.CONTROL) .click(multiselect.get(0))
		 * .click(multiselect.get(4)) .keyUp(Keys.CONTROL) .build() .perform();
		 */

		
		  actions.clickAndHold(multiselect.get(0));
		  //actions.clickAndHold(multiselect.get(1));
		  actions.clickAndHold(multiselect.get(2)).release(); 
		  actions.build().perform();
		 

		Thread.sleep(3000);

		driver.close();

	}

}
