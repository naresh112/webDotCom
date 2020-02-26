package com.webDotCom.qa.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LandingPageStepDef {
	Steps steps;
	public LandingPageStepDef(Steps steps) {
		this.steps=steps;
	}
	@And("user click on get starterd link")
	public void user_click_on_get_starterd_link() {
		steps.packagespage=steps.landingpage.clickOnGetStarted();
	}
}
