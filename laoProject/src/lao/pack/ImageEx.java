package lao.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImageEx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.navigate().to("http://leafground.com/pages/Image.html");
		
	  WebElement Image1 = driver.findElement(By.xpath("//img[@src='../images/home.png']"));
	  Image1.click();
	  
	  driver.navigate().back();
	  
	  WebElement Image2 = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
	  
	  if (Image2.getAttribute("naturalWidth").equals("0")) {
		  System.out.println("Image is broken");
		
	}else {
		System.out.println("Image is broken");
	}
	  
	  Thread.sleep(2000);
	  
	  WebElement Image3 = driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));
	  
	  Actions actions = new Actions(driver);
	  
	  actions.moveToElement(Image3).click();
	  actions.build().perform();
	  
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	driver.close();
	  
	}

}
