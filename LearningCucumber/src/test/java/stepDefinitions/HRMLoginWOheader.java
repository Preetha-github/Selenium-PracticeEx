package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HRMLoginWOheader {

	WebDriver driver;
	 boolean searchresults;
	 WebElement search;
	 
	@Given("^EndUser is visiting the url - \"([^\"]*)\"$")
	public void enduser_is_visiting_the_url(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    
	}

	@When("^Enduser gives a valid credientials$")
	public void enduser_gives_a_valid_credientials(DataTable datatable) throws Throwable {
		List<String> credientials = datatable.asList(String.class);
		
		String uname = credientials.get(0);
		String pwd = credientials.get(1);
		
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	}

	@When("^Enduser presses 'Login' button$")
	public void enduser_presses_Login_button() throws Throwable {
		WebElement btn = driver.findElement(By.id("btnLogin"));
		btn.click();
	}


}
