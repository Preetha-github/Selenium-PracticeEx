package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectablePageObjects {
	
	@FindBy (xpath ="//*[contains(text(),'Item 1')]")
	public static WebElement Item1;
	
	@FindBy (xpath ="//*[contains(text(),'Item 2')]")
	public static WebElement Item2;
	
	@FindBy (xpath ="//*[contains(text(),'Item 3')]")
	public static WebElement Item3;
	
	@FindBy (xpath ="//*[contains(text(),'Item 4')]")
	public static WebElement Item4;
	
	@FindBy (xpath ="//*[contains(text(),'Item 5')]")
	public static WebElement Item5;
	
	@FindBy (xpath ="//*[contains(text(),'Item 6')]")
	public static WebElement Item6;
	
	@FindBy (xpath ="//*[contains(text(),'Item 7')]")
	public static WebElement Item7;

}
