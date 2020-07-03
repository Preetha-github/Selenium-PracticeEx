package west_Hounslow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextclickQA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		//maximize the window
		driver.manage().window().maximize();

		//open the site
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		Thread.sleep(2000);
		
		//Instiatiate the action class
		Actions actions = new Actions (driver);
		
		//find the element
		WebElement rightclk = driver.findElement(By.id("rightClickBtn"));
		
		//Right click to open the menu
		actions.contextClick(rightclk).perform();
		System.out.println("Right click Context Menu displayed");
		
		//
		WebElement copy = driver.findElement(By.xpath(".//div[@id='rightclickItem']/div[1]"));
		
		
		copy.click();
		//actions.click(copy);
		Thread.sleep(2000);
		
		//alert msg
		driver.switchTo().alert().accept();
		System.out.println("Right click Alert Accepted");
		
		
		//close window
		driver.close();
		
		

	}

}
