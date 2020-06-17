package com.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImageEx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Open the selectable page
		driver.navigate().to("http://leafground.com/pages/Image.html");
		
		Thread.sleep(2000);

		
		  WebElement image1 =
		  driver.findElement(By.xpath("//img[@src='../images/home.png']"));
		  image1.click(); driver.navigate().back();
		  
		  //Am I Broken Image?
		  
		  WebElement image2 = driver.findElement(By.xpath(
		  "//*[@id=\'contentblock\']/section/div[2]/div/div/img")); if
		  (image2.getAttribute("naturalWidth").equals("0")) {
		  System.out.println("Image is broken");
		  
		  
		  } else { System.out.println("Image is NOT broken"); }
		 
		
		
		Actions actions = new Actions(driver);
		WebElement image3 = driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));
		//Option1:
		//actions.click(image3);
		//Option2:
		//actions.moveToElement(image3).contextClick().build().perform();
		//Option3:
		actions.moveToElement(image3).sendKeys(Keys.ENTER);
		//Option4:
		//keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	
		Thread.sleep(2000);
		
		//actions.moveToElement(image3).click().build().perform();
		
		driver.close();
	}

}
