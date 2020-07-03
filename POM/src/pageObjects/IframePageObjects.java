package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IframePageObjects {
	@FindBy (id="Click")
	public static WebElement Frame1;
	
	
	@FindBy (id="Click1")
	public static WebElement Frame2;
	
	
	@FindBy ()
	public static WebElement Frame3;

}
