package com.webDotCom.qa.pages;

import org.openqa.selenium.WebDriver;

import com.webDotCom.qa.objectRepository.LandingPageProp;
import com.webDotCom.qa.utils.WebDriverUtils;

public class LandingPage extends WebDriverUtils implements LandingPageProp  {
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public PackagesPage clickOnGetStarted() {
		click(GET_STARTED_LOCATOR);
		return new PackagesPage(driver);
	}
	

}
