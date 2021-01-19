package com.basic.tagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		//dryRun = true,
		
		//tags={"@Important"}, // All scenarios executed if this is a tag for feature file
		//tags={"@Smoke"}, //only tag with smoke
		//tags={"@Smoke", "@Regression"}, // AND condition
		tags={"@Smoke, @Regression"}, // OR condition
		
		
		features={"src/test/resources/com/basic/tagsFF/"},
		glue={"com/basic/tagsSD/"},
		
		plugin = {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-json10.report",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport10.html"
		}
		
		)


public class RunTagsTest {
	

}
