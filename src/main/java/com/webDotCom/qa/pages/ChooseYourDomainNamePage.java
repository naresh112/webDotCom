package com.webDotCom.qa.pages;

import org.openqa.selenium.WebDriver;

import com.webDotCom.qa.objectRepository.ChooseYourDomainNamePageProp;
import com.webDotCom.qa.utils.WebDriverUtils;

public class ChooseYourDomainNamePage extends WebDriverUtils implements ChooseYourDomainNamePageProp {

	WebDriver driver;
	public ChooseYourDomainNamePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public void enterYourDomainName() {
		enterText(SEARCH_BOX_LOCATOR, "mybyke");
	}
	public CreateAccountPage clickOnSearchBtn() {
		click(CLICK_GET_MY_DOMAIN_LOCATOR);
		return new CreateAccountPage(driver);
	}
	
	

}
