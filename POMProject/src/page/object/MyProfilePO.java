package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePO {

	// MyProfile, city, phone, submit
	@FindBy (xpath= "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a")
	public static WebElement MyProfile;
	
	@FindBy (xpath= "//*[@id=\"profilefrm\"]/div/div/div[3]/div[1]/div/input")
	public static WebElement city;
	
	@FindBy (xpath = "//*[@id=\"profilefrm\"]/div/div/div[5]/div/div/input")
	public static WebElement phone;
	
	@FindBy (xpath = "//*[@id=\"profilefrm\"]/div/div/div[7]/div/button")
	public static WebElement submit;
	
	

	/*
	 * public static WebElement MyProfile(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a")
	 * );
	 * 
	 * }
	 * 
	 * public static WebElement city(WebDriver driver) {
	 * 
	 * return driver.findElement(By.xpath(
	 * "//*[@id=\"profilefrm\"]/div/div/div[3]/div[1]/div/input")); }
	 * 
	 * public static WebElement phone(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"profilefrm\"]/div/div/div[5]/div/div/input"));
	 * 
	 * }
	 * 
	 * public static WebElement submit(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"profilefrm\"]/div/div/div[7]/div/button"));
	 * 
	 * }
	 */
}
