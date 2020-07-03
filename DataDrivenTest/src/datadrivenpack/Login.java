package datadrivenpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {

	String[][] data = {  
		{"Admin","admin1236"},
		{"Admin1","admin123"},
		{"Admin1","admin1234"},
		{"Admin","admin123"}
		
	};
	
	@DataProvider (name="LoginData")
	public String[][] loginDataProvider(){
		return data;
		
	}
	
	@Test(dataProvider ="LoginData" )
	public void loginwith(String Uname, String Pwd) {
	
	
	System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com");
	
	WebElement username =driver.findElement(By.id("txtUsername"));
	username.sendKeys(Uname);
	
	WebElement password =driver.findElement(By.id("txtPassword"));
	password.sendKeys(Pwd);
	
	WebElement submit =driver.findElement(By.id("btnLogin"));
	submit.click();
	
	
	
}
}