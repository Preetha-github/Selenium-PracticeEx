package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage1PageObjects {
	
	@FindBy(linkText = "HyperLink") 
	public static WebElement hyperlink;
	
	@FindBy (linkText = "Edit")
	public static WebElement Edit;
	
	
	
}
