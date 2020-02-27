package com.webDotCom.qa.steps;

import io.cucumber.java.en.And;

public class ChooseYourDomainNameStepDef {
	Steps steps;
	public ChooseYourDomainNameStepDef(Steps steps) {
		this.steps=steps;
	}
	@And("user enter his domain name")
	public void user_enter_his_domain_name() {
		steps.choosedomainnamepage.enterYourDomainName();
	}
	@And("user click on search button")
	public void user_click_on_search_button() {
		steps.createaccountpage=steps.choosedomainnamepage.clickOnSearchBtn();
		
	}

}
