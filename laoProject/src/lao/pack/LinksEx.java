package lao.pack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.navigate().to("http://leafground.com/");
		
		driver.findElement(By.xpath("//*[text()='HyperLink']")).click();
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		
		WebElement Link2 = driver.findElement(By.partialLinkText("Find where"));
				
		String text1 = Link2.getAttribute("href");
		System.out.println("This link is going to:" + text1);
		
	WebElement errorlink = driver.findElement(By.linkText("Verify am I broken?"));
		errorlink.click();
		
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("Link is broken");
			
		}
		
		driver.navigate().back();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		int size = list.size();
		
		System.out.println("Number of links in the page: " + size );
		
		driver.close();
	}

}
