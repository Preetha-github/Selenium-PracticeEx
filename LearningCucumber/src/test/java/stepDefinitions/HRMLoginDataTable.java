package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HRMLoginDataTable {
	WebDriver driver;
	@Given("^Go to login_page - \"([^\"]*)\"$")
	public void go_to_login_page(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    
	}

	@When("^Enter correct credientials - \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_correct_credientials_and(String Username, String Password) throws Throwable {
	    
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
	}

	
	  @When("^Clicks 'Login' button$") public void clicks_Login_button() throws
	  Throwable { WebElement btn = driver.findElement(By.id("btnLogin"));
	  btn.click();
	  
	  }
	 


}
