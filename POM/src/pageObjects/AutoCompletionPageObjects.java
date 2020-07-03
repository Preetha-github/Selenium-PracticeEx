package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoCompletionPageObjects {

	@FindBy(id="tags")
	public static WebElement CourseName;
	
	@FindBy (xpath="//ul[@id='ui-id-1']/li[2]")
	public static WebElement li;
	
	
}
