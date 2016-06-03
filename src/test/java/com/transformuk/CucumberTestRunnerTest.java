package com.transformuk;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/cucumber", monochrome=true, 
				plugin={"json:target/cucumber.json"}, tags={"~@Ignore","~@ignore"})
public class CucumberTestRunnerTest {

}