package com.webDotCom.qa.pages;

import org.openqa.selenium.WebDriver;

import com.webDotCom.qa.objectRepository.PackagesPageProp;
import com.webDotCom.qa.utils.WebDriverUtils;

public class PackagesPage extends WebDriverUtils implements PackagesPageProp {
	WebDriver driver;

	public PackagesPage(WebDriver driver) {
		super(driver);
		this.driver=driver;	
	}
	public ChooseYourDomainNamePage clickOnStarterPackage() {
		click(STARTER_PACKAGE_LOCATOR);
		return new ChooseYourDomainNamePage(driver);
	}
	

}
