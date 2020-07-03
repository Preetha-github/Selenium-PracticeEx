package datadrivenpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CorrectUsername {

	@Parameters({"UserName","Password"})
	@Test
	public void RightUser(String Uname,String Pwd) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement Username = driver.findElement(By.id("txtUsername"));
		Username.sendKeys(Uname);

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(Pwd);

		WebElement submit = driver.findElement(By.id("btnLogin"));
		submit.click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
