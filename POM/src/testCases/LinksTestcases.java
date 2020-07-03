package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.Homepage1PageObjects;
import pageObjects.LinksPageObjects;

public class LinksTestcases {

	WebDriver driver;

	@Test
	public void links() {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		// Maximize the screen
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		//Navigate to url
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Link.html");

		//Page Factory initialize elements
		PageFactory.initElements(driver, Homepage1PageObjects.class);
		PageFactory.initElements(driver, LinksPageObjects.class);
		
		// Go to Home Page
		LinksPageObjects.Go_To_Home_Page.click();

		// Navigating back to Hyperlink page
		Homepage1PageObjects.hyperlink.click();

		// Find where am supposed to go without clicking me?
		String href = LinksPageObjects.Find_Where.getAttribute("href");
		System.out.println("Goes to link: " + href);
		
		//Verify am I broken?
		LinksPageObjects.Broken.click();
		String Title = driver.getTitle();
		if (Title.contains("404")) {
			System.out.println("WebPage is broken");

		} else

		{
			System.out.println("WebPage is NOT broken");
		}
		
		//Navigating back to Hyperlink page
		driver.navigate().back();
		
		//How many links are available in this page?
		List<WebElement> LinksNum = driver.findElements(By.tagName("a"));
		int size = LinksNum.size();

		System.out.println("Number of links : " + size);

	}

}
