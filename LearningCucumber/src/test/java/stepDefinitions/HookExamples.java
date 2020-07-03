package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HookExamples {

	@Given("^My first line$")
	public void my_first_line() throws Throwable {
		System.out.println("First");
	    
	}

	@When("^My second line$")
	public void my_second_line() throws Throwable {
		System.out.println("Second");
	    
	}

	@Then("^My third line$")
	public void my_third_line() throws Throwable {
		System.out.println("Third");
	    
	}

}
