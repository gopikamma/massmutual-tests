package stepdefinitions;

import com.pages.Page;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4Steps 
{
	private Page page = new Page(DriverFactory.getDriver());
	
	@When("fetch all values listed in the screen")
	public void fetch_all_values_listed_in_the_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("values should be formatted with curriencies")
	public void values_should_be_formatted_with_curriencies() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
