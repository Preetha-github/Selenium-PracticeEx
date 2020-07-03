package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxPageObjects {
	
	
	@FindBy(xpath="//input[@type='checkbox'][1]")
	public static WebElement selectlangJava;
	
	@FindBy (xpath="//input[@type='checkbox'][3]")
	public static WebElement selectsql;
	
	
	@FindBy(xpath="//*[@id=\"contentblock\"]/section/div[2]/input")
	public static WebElement Selchecked;
	
	
	@FindBy(xpath="//*[@id=\"contentblock\"]/section/div[3]/input[2]")
	public static WebElement Deselect;
	
	
	@FindBy(xpath="//*[@id=\"contentblock\"]/section/div[4]/input[1]")
	public static WebElement option1;
	
	@FindBy(xpath="//*[@id=\"contentblock\"]/section/div[4]/input[2]")
	public static WebElement option2;
	
	@FindBy(xpath="//*[@id=\"contentblock\"]/section/div[4]/input[3]")
	public static WebElement option3;
	
	@FindBy(xpath="//*[@id=\"contentblock\"]/section/div[4]/input[4]")
	public static WebElement option4;
	
	@FindBy(xpath="//*[@id=\"contentblock\"]/section/div[4]/input[5]")
	public static WebElement option5;
	
	@FindBy(xpath="//*[@id=\"contentblock\"]/section/div[4]/input[6]")
	public static WebElement option6;
	
	
}
