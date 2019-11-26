package com.stepDefinition;

import java.util.List;

import com.baseClass.BaseClass;
import com.screens.DepFlights;
import com.screens.HomeScreen;

import cucumber.api.java.en.*;
       
public class StepDef extends BaseClass {
	 HomeScreen hs;
	 DepFlights dp;
	@Given("User is in Home page")
	public void user_is_in_Home_page() {
		driver=launchBrowser();
		 maxi();
        loadUrl("https://www.cheapair.com/") ;
       
	}

	@Given("User selecting the valid credentials")
	public void user_selecting_the_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
		
		List<String> featu=dataTable.asList();
		hs=new HomeScreen();
		
		type(hs.getFrom().get(0),featu.get(0));
		type(hs.getTo().get(0),featu.get(1));
	btnClick(hs.getDepart().get(0));
		btnClick(hs.getdDte().get(0));
		btnClick(hs.getRtn().get(0));
	}

	@Given("User click search flights button")
	public void user_click_search_flights_button() {
	  
	}

	@When("User selecting the cheapest departure and return flights")
	public void user_selecting_the_cheapest_departure_and_return_flights() {
	   
	}

	@When("User click the continue button")
	public void user_click_the_continue_button() {
	  
	}

	@Then("User is in payment page")
	public void user_is_in_payment_page() {
	   
	}

}
