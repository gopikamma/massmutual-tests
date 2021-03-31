package stepdefinitions;

import org.junit.Assert;

import com.pages.Page;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2Steps 
{
	private static String text;
	private Page page = new Page(DriverFactory.getDriver());

	@When("fetch all the values presented in screen")
	public void fetch_all_the_values_presented_in_screen() {
		 // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();

	}

	@Then("all values count should greaterthan {int}")
	public void all_values_count_should_greaterthan(Integer int1) {
		try
		{
		text = page.getText_Of_Value_1();
		System.out.println("Page title is: " + text);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertEquals(text, int1);
	}
}
