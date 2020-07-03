package advanced.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://phptravels.net/login");
		
		driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demouser");
		
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
		
		
		
				
		

	}

}
