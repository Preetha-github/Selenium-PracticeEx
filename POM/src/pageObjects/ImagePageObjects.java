package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ImagePageObjects {
	
	@FindBy(xpath="//*[@src='../images/home.png']")
	public static WebElement HomepageImage;
	
	
	@FindBy(xpath="//*[@src='../images/abcd.jpg']")
	public static WebElement BrokenImage;
	
	
	@FindBy(xpath="//*[@src='../images/keyboard.png']")
	public static WebElement KeyboardImage;

}
