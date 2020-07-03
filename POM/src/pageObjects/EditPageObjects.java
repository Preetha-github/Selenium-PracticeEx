package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditPageObjects {
	
@FindBy (id="email")	
public static WebElement email_address;

@FindBy(xpath = "//input[@value='Append ']")
public static WebElement Append;

@FindBy (name="username")
public static WebElement gettext;

@FindBy (xpath="//input[@value='TestLeaf']")
public static WebElement cleartext;

@FindBy (xpath="//input[@disabled='true']")
public static WebElement edit_disabled;

}

