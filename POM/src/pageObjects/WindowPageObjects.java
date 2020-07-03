package pageObjects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class WindowPageObjects {

	@FindBy(id = "home")
	public static WebElement OpenHomeButton;

	@FindBy(xpath = "//*[contains(text(),'Open Multiple Windows')]")
	public static WebElement OpenMultipleButton;

	@FindBy(xpath = "//*[contains(text(),'Do not close me ')]")
	public static WebElement CloseButton;

	@FindBy(xpath = "//*[contains(text(),'Wait for 5 seconds')]")
	public static WebElement WaitButton;
}
