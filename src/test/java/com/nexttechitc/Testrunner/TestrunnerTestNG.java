package com.nexttechitc.Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestrunnerTestNG {

	//@RunWith (Cucumber.class)
	@CucumberOptions (
	features = {"Features"},
	glue = {"com.nexttecth.Stepdef"}
	)
	//tags = {"@sc2", "@sc1"}
	public class TestRunner extends AbstractTestNGCucumberTests{}
}

	
	