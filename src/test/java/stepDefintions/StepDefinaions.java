package stepDefintions;
 
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class StepDefinaions {
 
	@Given("user is in the login page")
	public void user_is_in_the_login_page() {
		// selenium code to go to loginpage
		System.out.println("user is in the login page for gmail");
	}
 
	@When("user enter valid name and password")
	public void user_enter_valid_name_and_password() {
		System.out.println("user entered valid name and password");
	}
 
	@And("clicks on sigin")
	public void clicks_on_sigin() {
		System.out.println("user clicks on siginbutton");
	}
 
	@Then("login should be successful")
	public void login_should_be_successful() {
		System.out.println(" logged in successfully");
	}
	
	@When("user enter Invalid name and password")
	public void user_enter_invalid_name_and_password() {
		System.out.println(" user entered invalid name and password");

	}
	@Then("login should not happen")
	public void login_should_not_happen() {
		System.out.println(" logged in Failed");

	}
	@When("user enter valid name as {string} and password as {string}")
	public void user_enter_valid_name_as_and_password_as(String cname, String cpass) {
	    System.out.println("user enter name as " +cname+"  " +"user entered pass as:" +cpass);
	}
 
}