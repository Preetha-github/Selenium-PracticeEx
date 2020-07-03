package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POLogin {
	
	@FindBy(name="username")
	public static WebElement username;

	@FindBy(name="password")
	public static WebElement password;


	@FindBy(xpath="//button[@type='submit']")
	public static WebElement submit;


	
	/*public static WebElement username(WebDriver driver) {

		return driver.findElement(By.name("username"));
		
	}

	public static WebElement password(WebDriver driver) {

		return driver.findElement(By.name("password"));
		
	}

	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@type='submit']"));
		*/
		
	}


