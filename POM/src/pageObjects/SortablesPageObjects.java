package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortablesPageObjects {
	
	
	@FindBy(xpath="//ul[@id='sortable']/li[1]")
	public static WebElement Item1;
	
	@FindBy(xpath="//ul[@id='sortable']/li[2]")
	public static WebElement Item2;
	
	@FindBy(xpath="//ul[@id='sortable']/li[3]")
	public static WebElement Item3;
	
	@FindBy(xpath="//ul[@id='sortable']/li[4]")
	public static WebElement Item4;
	
	@FindBy(xpath="//ul[@id='sortable']/li[5]")
	public static WebElement Item5;
	
	@FindBy(xpath="//ul[@id='sortable']/li[6]")
	public static WebElement Item6;
	
	@FindBy(xpath="//ul[@id='sortable']/li[7]")
	public static WebElement Item7;
	
	

}
