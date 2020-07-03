package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPageObjects {
	
	@FindBy(xpath="//button[contains(text(),'Alert Box')]")
	public static WebElement AlertBox;
	
	@FindBy(xpath="//button[contains(text(),'Confirm Box')]")
	public static WebElement ConfirmBox;
	
	@FindBy(xpath="//button[contains(text(),'Prompt Box')]")
	public static WebElement PromptBox;
	
	
	
	

}
