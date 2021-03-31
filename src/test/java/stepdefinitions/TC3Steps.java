package stepdefinitions;

import org.junit.Assert;

import com.pages.Page;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3Steps 
{
	private static String text;
	private Page page = new Page(DriverFactory.getDriver());
	
	@When("fetch total balance")
	public void fetch_total_balance() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("fetch sum of all the values except total balance")
	public void fetch_sum_of_all_the_values_except_total_balance() {
		try
		{
		text = "All Values Sum";
		System.out.println("All Values Sum is: " + text);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("sum of all the values and total balance should be equal")
	public void sum_of_all_the_values_and_total_balance_should_be_equal() {
	    String Expected = page.getText_Of_Total_Balance();
	    Assert.assertEquals(Expected, text);
	}

}
