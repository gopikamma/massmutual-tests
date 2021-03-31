package stepdefinitions;

import com.pages.Page;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5Steps 
{
	private Page page = new Page(DriverFactory.getDriver());
	
	@When("fetch sum of all the values")
	public void fetch_sum_of_all_the_values() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("total balance should matches sum of all the values")
	public void total_balance_should_matches_sum_of_all_the_values() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
