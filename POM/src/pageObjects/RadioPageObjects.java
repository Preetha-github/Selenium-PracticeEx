package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioPageObjects {
	
	@FindBy (xpath="//input[@name='news'][2]")
	public static WebElement Defaultradio;
	
	
	@FindBy (xpath="//input[@value=2]")
	public static WebElement AgeGroup;

}
