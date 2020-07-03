package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DroppablePageObjects {
	
	@FindBy(id = "draggable")
	public static WebElement Drag;
	
	@FindBy(id = "droppable")
	public static WebElement Drop;

}
