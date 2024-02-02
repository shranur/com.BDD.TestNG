package stepDefintions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	    System.out.println("user is on register page");
	}
	@When("user enters following details")
	public void user_enters_following_details(DataTable dt) {
		
		List<List<String>> data=dt.cells();
		List<String>li=data.get(0);
		String fName= li.get(0);
		String lName = li.get(1);
		
		List<String>li1=data.get(1);
		String phonNum= li1.get(0);
		String email = li1.get(1);
		
		System.out.println("firstname is:" +fName +"last name is:" +lName +" "+"Phone number is:" +phonNum +" "+"Email is:" +email);
		
	   
	}
	@When("user click on submit button")
	public void user_click_on_submit_button() {
	    System.out.println("user clicks on submit button");
	}
	@Then("user should be registered successfully")
	public void user_should_be_registered_successfully() {
	    System.out.println("registration successful");
	}

}
