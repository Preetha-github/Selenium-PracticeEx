package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HRMLoginWithHeaders {
	WebDriver driver;
	boolean searchresults;
	WebElement search;

	@Given("^Testuser is on login_page - \"([^\"]*)\"$")
	public void testuser_is_on_login_page(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}

	@When("^Testuser enters a correct credientials$")
	public void testuser_enters_a_correct_credientials(DataTable datatable) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

		List<Map<String, String>> credentials = datatable.asMaps(String.class, String.class);

		String uname = credentials.get(0).get("Username");
		String pwd = credentials.get(0).get("Password");

		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	}

	@When("^Testuser clicks 'Login' button$")
	public void testuser_clicks_Login_button() throws Throwable {
		WebElement btn = driver.findElement(By.id("btnLogin"));
		btn.click();

	}

}
