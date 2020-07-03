package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleDefinitions {
	WebDriver driver;
	 boolean searchresults;
	 WebElement search;
	
	@Given("^the user navigates to the url - 'http://google\\.co\\.in'$")
	public void the_user_navigates_to_the_url_http_google_co_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("http://google.co.in");
	    
	}

	@When("^the user types the search term - 'selenium tutorials'$")
	public void the_user_types_the_search_term_selenium_tutorials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		search = driver.findElement(By.name("q"));
		search.sendKeys("selenium tutorials");
	    
	}

	@When("^the user hits - 'ENTER' Key$")
	public void the_user_hits_ENTER_Key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		search.sendKeys(Keys.ENTER);
		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 */
		
		
	    
	}

	@Then("^the search results should be displayed$")
	public void the_search_results_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Thread.sleep(3000);
	  searchresults= driver.findElement(By.partialLinkText("selenium")).isDisplayed();
	    if (searchresults) {
			System.out.println("Selenium results are fetched");
		}
	}


}
