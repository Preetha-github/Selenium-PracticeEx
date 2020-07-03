package west_Hounslow;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewfileUpload {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		
		//SELECT CHOOSEFILE
		
		
		
	//accept checkbox
		
		WebElement AcceptchkBox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
		AcceptchkBox.click();
		Thread.sleep(2000);
		

	}

}
