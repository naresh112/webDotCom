package com.webDotCom.qa.steps;

import com.webDotCom.qa.basePage.WebDotComBasePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BasePageStepDef {
	Steps steps;
	public BasePageStepDef(Steps steps) {
		this.steps=steps;
		steps.basepage=new WebDotComBasePage();
	}
	@Given("user launch browser")
	public void user_launch_browser() {
		steps.basepage.intilizeDriver();
	}
	@When("user enters url")
	public void user_enters_url() {
		steps.landingpage=steps.basepage.enterURL();
	}

}
