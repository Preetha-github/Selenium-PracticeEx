package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HRMLogin {
	 WebDriver driver;
	 boolean searchresults;
	 WebElement search;
	
	@Given("^User is on the url - \"([^\"]*)\"$")
	public void user_is_on_the_url(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    
	}

	@When("^User enters a valid username and password$")
	public void user_enters_a_valid_username_and_password() throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
	    
	}

	@And("^User clicks 'Login' button$")
	public void user_clicks_Login_button() throws Throwable {
		WebElement btn = driver.findElement(By.id("btnLogin"));
		btn.click();
	}

	@Then("^Homepage should be displayed$")
	public void homepage_should_be_displayed() throws Throwable {
		if (driver.findElement(By.linkText("Welcome Admin")).isDisplayed()) {
			System.out.println("Homepage is displayed");
			
		}else {
			System.out.println("Homepage is NOT displayed");
		}
	    
	}


}
