package com.richtexteditor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/sortable/");
		Thread.sleep(2000);
		
		List<WebElement>elementsObj =  driver.findElements(By.xpath("//*[@id='sortable\']/li"));
		WebElement fromElement = elementsObj.get(6);
	WebElement ToElement = elementsObj.get(0);
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(fromElement);
		action.moveToElement(ToElement);
		action.release(ToElement);
	action.build().perform();
		
		
		WebElement fromElement1 = elementsObj.get(6);
		WebElement ToElement1 = elementsObj.get(1);
		
		Actions action1 = new Actions(driver);
		
		action1.clickAndHold(fromElement1);
		action1.moveToElement(ToElement1);
		action1.release(ToElement1);
		action1.build().perform();	
		
		WebElement fromElement2 = elementsObj.get(6);
		WebElement ToElement2 = elementsObj.get(2);
		
		Actions action2 = new Actions(driver);
		
		action2.clickAndHold(fromElement2);
		action2.moveToElement(ToElement2);
		action2.release(ToElement2);
	action2.build().perform();

	}

}
