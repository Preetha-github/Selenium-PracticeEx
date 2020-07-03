package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.ImagePageObjects;


public class ImageTestcases {
	
	WebDriver driver;
	@Test
	public void Img () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();

		// Maximize the screen
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		// Navigate to url
		driver.navigate().to("http://leafground.com/pages/Image.html");

		PageFactory.initElements(driver, ImagePageObjects.class);
		
		ImagePageObjects.HomepageImage.click();
		driver.navigate().back();
		
		String nat = ImagePageObjects.BrokenImage.getAttribute("naturalWidth");
		if (nat.equals("0")) {
			System.out.println("Image is BROKEN");
			
		}else
		{
			System.out.println("Image is NOT BROKEN");
		}
		
		Actions actions = new Actions(driver);
		actions.moveToElement(ImagePageObjects.KeyboardImage).click();
		actions.build().perform();
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
