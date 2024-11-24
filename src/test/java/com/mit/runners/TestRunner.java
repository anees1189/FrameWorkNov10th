package com.mit.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "Features",
		glue = "com.mit.steps"
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
