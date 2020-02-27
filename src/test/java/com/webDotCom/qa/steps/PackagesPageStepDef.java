package com.webDotCom.qa.steps;

import io.cucumber.java.en.And;

public class PackagesPageStepDef {
	Steps steps;
	public PackagesPageStepDef(Steps steps) {
		this.steps=steps;
	}
	@And("user select starter package and add it to cart")
	public void user_select_starter_package_and_add_it_to_cart() {
		steps.choosedomainnamepage=steps.packagespage.clickOnStarterPackage();
	}

}
