package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalenderPageObjects {
	
	@FindBy(id = "datepicker")
	public static WebElement date;
	
	
	@FindBy(xpath="//a[@title='Next']")
	public static WebElement next;
	
	
	@FindBy(xpath="//a[contains(text(),'10')]")
	public static WebElement day;
}
