package com.webDotCom.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="G:\\naresh practice\\I Hub Selenium Manoj Sir\\WebDotComAutomation\\src\\test\\resources\\Features",
				glue="com.webDotCom.qa.steps",
				plugin="de.monochromata.cucumber.report.PrettyReports:target/cucumberReports1")

public class RunnerTest {
	

}
