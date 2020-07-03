package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Hooks{
	WebDriver driver;
	
	@Given("^User on  url - \"([^\"]*)\"$")
	public void user_on_url(String arg1) throws Throwable {
		System.out.println("Hello....");
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    
	}

	@When("^Enters valid username and password$")
	public void enters_valid_username_and_password() throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");   
	}

	@When("^Click 'Login' button$")
	public void click_Login_button() throws Throwable {
		WebElement btn = driver.findElement(By.id("btnLogin"));
		btn.click();
	}

}
