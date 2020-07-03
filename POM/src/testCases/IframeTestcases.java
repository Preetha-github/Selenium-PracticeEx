package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.IframePageObjects;


public class IframeTestcases {
	WebDriver driver;
	@Test
	public void iframe1() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
	driver = new ChromeDriver();

	// Maximize the screen
	driver.manage().window().maximize();

	// Implicit wait
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	// Navigate to url
	driver.navigate().to("http://testleaf.herokuapp.com/pages/frame.html");
	
	PageFactory.initElements(driver, IframePageObjects.class);
	
	driver.switchTo().frame(0);
	IframePageObjects.Frame1.click();
	String text = IframePageObjects.Frame1.getText();
	System.out.println(text);
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(1);
	driver.switchTo().frame("frame2");
	IframePageObjects.Frame2.click();
	String t1 = IframePageObjects.Frame2.getText();
	System.out.println(t1);
	
	driver.switchTo().defaultContent();
	
	List<WebElement> li= driver.findElements(By.tagName("iframe"));
	int size =li.size();
	System.out.println(size);
	
	driver.quit();
}
	
}
