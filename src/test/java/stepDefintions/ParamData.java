package stepDefintions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ParamData {

	@Given("user is in the loginpage for Rediff")
	public void user_is_in_the_loginpage_for_rediff() {
		 System.out.println(" user is in the login page for rediff");

	}
	@When("^user enter name as (.+) and password as (.+) for rediff$")
	public void user_enter_name_as_name3_and_password_as_password3_for_rediff(String cn, String cp) {
		  System.out.println("user entered user name as "+cn+" and password is "+cp); 

	}
	@When("clicks on ok button")
	public void clicks_on_ok_button() {
		   System.out.println(" clicked on ok button");

	}
}
