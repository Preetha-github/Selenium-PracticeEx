package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadFilePageObjects {
	
	@FindBy(name="filename")
	public static WebElement ChooseFile;

}
