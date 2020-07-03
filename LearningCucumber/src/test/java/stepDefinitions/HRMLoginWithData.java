package stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HRMLoginWithData {
	WebDriver driver;
	 boolean searchresults;
	 WebElement search;
	
	@Given("^User is on login page - \"([^\"]*)\"$")
	public void user_is_on_login_page(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    
	}

	@When("^User enters a valid credientials - \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_a_valid_credientials_and(String username, String password) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^User clicks on 'Login' button$")
	public void user_clicks_on_Login_button() throws Throwable {
	    
		WebElement btn = driver.findElement(By.id("btnLogin"));
		btn.click();
	}

	@Then("^Navigates to Homepage$")
	public void navigates_to_Homepage() throws Throwable {
	    
		if (driver.findElement(By.linkText("Welcome Admin")).isDisplayed()) {
			System.out.println("Homepage is displayed");
			
		}else {
			
	}
	}
}

