package beforeAndAfter;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

	
public class OpenAndClose {
	 WebDriver driver;
	
	@Before
	public void OpenChrome() {
		System.out.println("holla..");
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		
	}

	@After
	public void CloseChrome() {
		System.out.println("closeeee");
		//String window = driver.getWindowHandle();
		//driver.switchTo().window(window);
		System.out.println("driver :" + driver);
		driver.quit();

	}
}
