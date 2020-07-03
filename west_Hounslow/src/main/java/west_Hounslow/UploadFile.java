package west_Hounslow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		//maximize the window
		driver.manage().window().maximize();

		//open the site
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		System.out.println("link opened");
		//Find element
		
		File file = new File("Screenshot 2020-02-25");
		
		StringSelection stringSelection= new StringSelection(file.getAbsolutePath());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		Robot robot = new Robot();
				 
				// Cmd + Tab is needed since it launches a Java app and the browser looses focus
				 
				robot.keyPress(KeyEvent.VK_META);
				 
				robot.keyPress(KeyEvent.VK_TAB);
				 
				robot.keyRelease(KeyEvent.VK_META);
				 
				robot.keyRelease(KeyEvent.VK_TAB);
				 
				robot.delay(500);
				 
				//Open Goto window
				 
				robot.keyPress(KeyEvent.VK_META);
				 
				robot.keyPress(KeyEvent.VK_SHIFT);
				 
				robot.keyPress(KeyEvent.VK_G);
				 
				robot.keyRelease(KeyEvent.VK_META);
				 
				robot.keyRelease(KeyEvent.VK_SHIFT);
				 
				robot.keyRelease(KeyEvent.VK_G);
				 
				//Paste the clipboard value
				 
				robot.keyPress(KeyEvent.VK_META);
				 
				robot.keyPress(KeyEvent.VK_V);
				 
				robot.keyRelease(KeyEvent.VK_META);
				 
				robot.keyRelease(KeyEvent.VK_V);
				 
				//Press Enter key to close the Goto window and Upload window
				 
				robot.keyPress(KeyEvent.VK_ENTER);
				 
				robot.keyRelease(KeyEvent.VK_ENTER);
				 
				robot.delay(500);
				 
				robot.keyPress(KeyEvent.VK_ENTER);
				 
				robot.keyRelease(KeyEvent.VK_ENTER);
		
//		WebElement Choosefile = driver.findElement(By.xpath("//input[@type = 'file']"));
//		Choosefile.sendKeys(file);
//		Thread.sleep(2000);
//		
//		//accept checkbox
//		
//		WebElement AcceptchkBox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
//		AcceptchkBox.click();
//		Thread.sleep(2000);
		
		//click submit button
		
		WebElement SubmitBtn = driver.findElement(By.id("submitbutton"));
		SubmitBtn.click();
//		
//		//close the window
//		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
