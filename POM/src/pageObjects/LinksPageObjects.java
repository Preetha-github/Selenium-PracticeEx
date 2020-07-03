package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinksPageObjects {

	@FindBy(linkText = "Go to Home Page")
	public static WebElement Go_To_Home_Page;

	@FindBy(linkText = "Find where am supposed to go without clicking me?")
	public static WebElement Find_Where;

	@FindBy(linkText = "Verify am I broken?")
	public static WebElement Broken;

	@FindBy(xpath = "//*[contains(text(),'Interact with same link name')]")
	public static WebElement Go_to_Homepage_samelink;

//	@FindBy(linkText = "How many links are available in this page?")
//	public static WebElement How_many_links;

	
}
