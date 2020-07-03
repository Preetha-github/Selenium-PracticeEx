package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPageObjects {

	@FindBy(id = "dropdown1")
	public static WebElement UsingIndex;

	@FindBy(name = "dropdown2")
	public static WebElement UsingText;

	@FindBy(id = "dropdown3")
	public static WebElement UsingValue;

	@FindBy(xpath = "//*[@id=\"contentblock\"]/section/div[4]/select")
	public static WebElement numberOfOptions;


	@FindBy (xpath="//*[@id=\"contentblock\"]/section/div[5]/select")
	public static WebElement sendKeysSelect;

	@FindBy(xpath = "//*[@id=\"contentblock\"]/section/div[6]/select")
	public static WebElement SelectPorgrams;

}





//@FindBy(xpath = "//*[contains(text(),'You can also use sendKeys to select')]")