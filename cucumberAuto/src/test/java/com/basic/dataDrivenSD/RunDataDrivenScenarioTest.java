package com.basic.dataDrivenSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	 @RunWith(Cucumber.class)
	 @CucumberOptions(
			 
			 
			 monochrome=true,
			 //dryRun=true,
			 
			 features=
		 {"src/test/resources/com/basic/DataDrivenFF/"},
		 glue= {"com/basic/dataDrivenSD/"},
		 
			 plugin= {"pretty",
					  "html:target/cucumber-htmlreport",
					  "json:target/cucumber-report2.json",
					  "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport2.html"
			 }
			 
			 
			 )
	 
	 public class RunDataDrivenScenarioTest {

	 
}
