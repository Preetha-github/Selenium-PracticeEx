package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMyProfile {

	
	
	@FindBy(xpath = "//a[@href='#profile']")
	public static WebElement profile;
	
	@FindBy (name ="city")
	public static WebElement city;
	
	
	@FindBy (name="phone")
	public static WebElement phone;
	
	@FindBy (xpath = "//button[@type='submit']")
	public static WebElement submit;
	
	/*
	 * public static WebElement profile(WebDriver driver) {
	 * 
	 * return driver.findElement(By.xpath("//a[@href='#profile']"));
	 * 
	 * 
	 * }
	 * 
	 * public static WebElement city(WebDriver driver) { return
	 * driver.findElement(By.name("city"));
	 * 
	 * 
	 * }
	 * 
	 * public static WebElement phone(WebDriver driver) {
	 * 
	 * return driver.findElement(By.name("phone"));
	 * 
	 * 
	 * }
	 * 
	 * public static WebElement submit(WebDriver driver) { return
	 * driver.findElement(By.xpath("//button[@type='submit']"));
	 * 
	 * 
	 * }
	 */

}