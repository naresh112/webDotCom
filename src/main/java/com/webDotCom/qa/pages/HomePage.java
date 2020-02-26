package com.webDotCom.qa.pages;

import org.openqa.selenium.WebDriver;

import com.webDotCom.qa.objectRepository.HomePageProp;

public class HomePage implements HomePageProp {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}

}
