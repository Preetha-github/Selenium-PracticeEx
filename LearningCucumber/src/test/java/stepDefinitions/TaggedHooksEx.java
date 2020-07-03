package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksEx {
	
	@Given("^First statement - One$")
	public void first_statement_One() throws Throwable {
	    System.out.println("1st stmt");
	}

	@When("^Second statement - two$")
	public void second_statement_two() throws Throwable {
		System.out.println("2nd stmt");
	    
	}

	@Then("^Third statement - three$")
	public void third_statement_three() throws Throwable {
		System.out.println("3rd stmt");
	    
	}


}
