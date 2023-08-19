package com.stepdefinition;

import com.base.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Googlestep extends Baseclass{
	
	@Given("^User Must Launch the \"([^\"]*)\" Browser$")
	public void user_Must_Launch_the_Browser(String arg1) throws Throwable {

	browserlaunch(arg1);
	
	
	}

	@When("^User Must Launch the \"([^\"]*)\" Url$")
	public void user_Must_Launch_the_Url(String arg1) throws Throwable {
		
		launchUrl(arg1);
	}
	

}
