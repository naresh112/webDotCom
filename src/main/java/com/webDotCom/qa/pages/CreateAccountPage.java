package com.webDotCom.qa.pages;

import org.openqa.selenium.WebDriver;

import com.webDotCom.qa.objectRepository.CreateAccountPageProp;
import com.webDotCom.qa.utils.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils implements CreateAccountPageProp{

	WebDriver driver;
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	

}
