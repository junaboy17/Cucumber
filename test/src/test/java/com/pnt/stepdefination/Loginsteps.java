package com.pnt.stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	
	@Given("I open broweser chrome")
	public void i_open_broweser_chrome() {
		System.out.println();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Open Browser");
	}

	@And("I browse to www.multicart.com")
	public void i_browse_to_www_multicart_com() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Open Browser");

	}

	@And("I enter my ID")
	public void i_enter_my_ID() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Open Browser");

	}

	@And("I enter my Password")
	public void i_enter_my_Password(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new cucumber.api.PendingException();
		System.out.println("Open Browser");

	}

	@And("I click the login button")
	public void i_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Open Browser");

	}

	@Then("I see my profile as James William")
	public void i_see_my_profile_as_James_William() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Open Browser");

	}

}
