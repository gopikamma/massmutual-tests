package stepdefinitions;

import org.junit.Assert;

import com.pages.Page;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1Steps 
{
	private static String text;
	private Page page = new Page(DriverFactory.getDriver());
	
	@Given("user is on respective page")
	public void user_is_on_respective_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("fetch all the respective text values")
	public void fetch_all_the_respective_text_values() {
		try
		{
		text = page.getText_Of_Value_1();
		System.out.println("Text value is: " + text);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("all the appeared values should matched right count")
	public void all_the_appeared_values_should_matched_right_count() {
	    // Write code here that turns the phrase above into concrete actions
	    String Expected = "Expected_Value";
	    Assert.assertEquals(Expected, text);
	}

}
