package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataTablePageObjects {
	
	@FindBy(xpath = "//th")
	public static WebElement colums;
	
	@FindBy(xpath = "//tr")
	public static WebElement rows;
	
	@FindBy(xpath = "//td[contains(text(),'Learn to interact with Elements')]")
	public static WebElement interact;
	
	

}
