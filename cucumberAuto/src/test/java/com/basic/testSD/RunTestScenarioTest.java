package com.basic.testSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	 @RunWith(Cucumber.class)
	 @CucumberOptions(
			 
			 
			 monochrome=true,
			 //dryRun=true,
			 
			 features=
		 {"src/test/resources/com/basic/testFF/"},
		 glue= {"com/basic/testSD/"},
		 
			 plugin= {"pretty",
					  "html:target/cucumber-htmlreport",
					  "json:target/cucumber-report8.json",
					  "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html"
			 }
			 
			 
			 )
	 
	 public class RunTestScenarioTest {

	 
}
