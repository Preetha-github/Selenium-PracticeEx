package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadPageObjects {
	
	@FindBy (xpath="//a[text()='Download Excel']")
	public static WebElement Excel;
	
	@FindBy (xpath="//a[text()='Download PDF']")
	public static WebElement pdf;
	
	@FindBy (xpath="//a[text()='Download Text']")
	public static WebElement text;

}
