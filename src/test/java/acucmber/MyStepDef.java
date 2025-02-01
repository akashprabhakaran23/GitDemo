package acucmber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//update 2
public class MyStepDef {

	@Given("I'm busy")
	public void i_m_busy() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I am not working")
	public void i_am_not_working() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I do dummy things")
	public void i_do_dummy_things() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("^I do dummy things (\\d+)$")
	public void iDoDummyThings(int arg1) throws Throwable {
		throw new io.cucumber.java.PendingException();
	}
}
