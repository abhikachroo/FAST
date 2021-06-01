package stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class Web {
 
	
	@Given("Precondition is given")
	public void precondition_is_given() {
	   System.out.println("Precondition is given");
	}
 
	@When("Something is done")
	public void something_is_done() {
	    System.out.println("Something is done");
	}
 
	@Then("Something is expected")
	public void something_is_expected() {
	    System.out.println("Something is expected");
	}
 
	@Given("Another precondition is given")
	public void another_precondition_is_given() {
	   System.out.println("Another precondition is given");
	}
 
	@When("Something is done again")
	public void something_is_done_again() {
	    System.out.println("Something is done again - 2nd Scenario");
	}
 
	@Then("Something is expected again")
	public void something_is_expected_again() {
	    System.out.println("Something is expected again - 2nd Scenario");
	}
 
 
}