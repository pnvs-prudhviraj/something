package cucp.cucu;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class itsit {
	@When("I go to login page")
	public void i_go_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Account creation");
	}

	@When("I enter user details")
	public void i_enter_user_details(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String,String>> list=dataTable.asMaps(String.class,String.class);
	   
	   for(int i=0;i<list.size();i++)
	   {
		   System.out.println(list.get(i).get("username"));
		   System.out.println(list.get(i).get("password"));
		   
	   }
	}

	@When("Select HeadPhones and add to cart")
	public void select_HeadPhones_and_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("the payment page should be appeared")
	public void the_payment_page_should_be_appeared() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
