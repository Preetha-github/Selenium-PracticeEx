import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part4 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://testleaf.herokuapp.com/pages/Link.html");
			Thread.sleep(2000);
			
			WebElement HomePageLink = driver.findElement(By.linkText("Go to Home Page"));
			HomePageLink.click();
			
			Thread.sleep(2000);
			

			WebElement LinkPage = driver.findElement(By.xpath("//a[@href = 'pages/Link.html']"));
			LinkPage.click();
			
			Thread.sleep(2000);
//			
//			WebElement HomePageLink1 = driver.findElement(By.linkText("Go to Home Page"));
//			HomePageLink1.click();
			
			WebElement FindPage = driver.findElement(By.partialLinkText("Find where am"));
			FindPage.click();
			
			Thread.sleep(3000);
			
			WebElement HomeButton = driver.findElement(By.id("home"));
			HomeButton.click();
			
			Thread.sleep(2000);
			//
			
			WebElement LinkPage3 = driver.findElement(By.xpath("//a[@href = 'pages/Link.html']"));
			LinkPage3.click();
			
			Thread.sleep(2000);
			
			WebElement HomePageLink2 = driver.findElement(By.linkText("Go to Home Page"));
			HomePageLink2.click();
			
			WebElement LinkPage4 = driver.findElement(By.xpath("//a[@href = 'pages/Link.html']"));
			LinkPage4.click();
			
			Thread.sleep(2000);
			
			//How many links are available in this page?
			
			 List<WebElement> tagTotal = driver.findElements(By.tagName("a"));
			 int size = tagTotal.size();
			 
			 System.out.println("=====================================");
			 System.out.println("Number of links in the page is: " + size);
			 System.out.println("=====================================");
			
	}

}
